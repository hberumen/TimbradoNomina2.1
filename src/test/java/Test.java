import me.hberumen.nomina.bd.mappers.NominaMapper;
import me.hberumen.nomina.generador.Generador;
import me.hberumen.nomina.modelo.Complemento;
import me.hberumen.nomina.modelo.Comprobante;
import me.hberumen.nomina.modelo.Nomina;
import me.hberumen.nomina.generador.TimbradoNomina;
import me.hberumen.nomina.modelo.jtd.ComprobanteDb;
import me.hberumen.nomina.wsTimbrado.*;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        CertificadoSAT certificado = new CertificadoSAT();
        Timbrado timbrar = new TimbradoImpl();

        ComprobanteDb comprobante = mapper.seleccionarComprobantePorAgrupa("").get(0);
        Generador generador = new Generador(comprobante, mapper);
        generador.generaCfdiNomina();

        String xml = generador.generaXml();
        SelloDigital selloDigital = new SelloDigital(xml, cadena,llave);

        comprobante.setCertificado(certificado.getCertificado());
        comprobante.setNoCertificado(certificado.getNoCertificado());
        comprobante.setSello(selloDigital.getSelloDigital());

        xml = generador.generaXml();
        timbrar.setXml(xml);
        String xmlTimbrado = timbrar.timbrar();
        //generador.validarXml();
        System.out.print(xmlTimbrado);


    }
}
