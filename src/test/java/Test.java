import me.hberumen.nomina.bd.mappers.NominaMapper;
import me.hberumen.nomina.generador.Generador;
import me.hberumen.nomina.modelo.Nomina;
import me.hberumen.nomina.modelo.jtd.ComprobanteDb;
import me.hberumen.nomina.wsTimbrado.*;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.util.List;

/**
 * Created by hberumen on 25/11/16.
 */
public class Test {

    private File cadena;
    private File llave;
    private TipoTest tipoTest;

    public Test(TipoTest tipoTest) {
        this.tipoTest = tipoTest;
        cadena = new File(Config.PATH_SAT+Config.CADENA_ORIGINAL);
        llave = new File(Config.PATH_SAT+Config.LLAVE);
    }

    public void doTest(){

        try {

            final CertificadoSAT certificado = new CertificadoSAT();
            Timbrado timbrar = new TimbradoImpl();

            NominaMapper mapperc = tipoTest.getMapper();
            List<ComprobanteDb> comprobantes = mapperc.seleccionarComprobantePorAgrupa(new BigInteger("1"));

            comprobantes.stream().parallel().forEach(comprobante ->{

                NominaMapper mapper = tipoTest.getMapper();
                Generador generador = new Generador(comprobante, mapper);
                generador.generaCfdiNomina();

                String xml = generador.generaXml();
                SelloDigital selloDigital = new SelloDigital(xml, cadena,llave);

                comprobante.setCertificado(certificado.getCertificado());
                comprobante.setNoCertificado(certificado.getNoCertificado());
                try {

                    comprobante.setSello(selloDigital.getSelloDigital());
                    xml = generador.generaXml();
                    timbrar.setXml(xml);
                    String xmlTimbrado = timbrar.timbrar();
                    //generador.validarXml();
                    System.out.print(xmlTimbrado);
                    System.out.println(" ---   ---   ----");

                } catch (TransformerException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (GeneralSecurityException e) {
                    e.printStackTrace();
                }
            });


        } catch (CertificateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String ... s) throws JAXBException {

        Test test = new Test(TipoTest.LOCAL);
        test.doTest();

    }
}

