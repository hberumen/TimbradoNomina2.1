import me.hberumen.nomina.bd.mappers.NominaMapper;
import me.hberumen.nomina.generador.Generador;
import me.hberumen.nomina.modelo.jtd.ComprobanteDb;
import me.hberumen.nomina.wsTimbrado.*;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.util.List;

/**
 * Created by hberumen on 25/11/16.
 */
public class Test {

    public Test() {
    }

    public static void main(String ... s) throws JAXBException {

        NominaMapper mapper = new ImplNominaMapperTest();

        File cadena = new File(Config.PATH_SAT+Config.CADENA_ORIGINAL);
        File llave = new File(Config.PATH_SAT+Config.LLAVE);

        try {


            final CertificadoSAT certificado = new CertificadoSAT();
            Timbrado timbrar = new TimbradoImpl();

            List<ComprobanteDb> comprobantes = mapper.seleccionarComprobantePorAgrupa("");
            comprobantes.stream().parallel().forEach(comprobante ->{
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
}
