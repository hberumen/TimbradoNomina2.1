import me.hberumen.nomina.bd.mappers.NominaMapper;
import me.hberumen.nomina.generador.Generador;
import me.hberumen.nomina.modelo.Complemento;
import me.hberumen.nomina.modelo.Comprobante;
import me.hberumen.nomina.modelo.Nomina;
import me.hberumen.nomina.generador.TimbradoNomina;
import me.hberumen.nomina.modelo.jtd.ComprobanteDb;

import javax.xml.bind.JAXBException;
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
        ComprobanteDb comprobante = mapper.seleccionarComprobantePorAgrupa("").get(0);
        Generador generador = new Generador(comprobante, mapper);
        generador.generaCfdiNomina();
        generador.generaXml();

    }
}
