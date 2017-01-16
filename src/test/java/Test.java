import me.hberumen.nomina.modelo.Complemento;
import me.hberumen.nomina.modelo.Comprobante;
import me.hberumen.nomina.modelo.Nomina;
import me.hberumen.nomina.generador.TimbradoNomina;
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

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");

        TimbradoNomina timbradoNomina = new TimbradoNomina();
        Comprobante comprobante = null;

        comprobante.setVersion("3.2");
        comprobante.setSerie("Serie");
        comprobante.setFolio("Folio");
        comprobante.setFecha(sdf.format(new Date()));
        comprobante.setSello("Sello");
        comprobante.setFormaDePago("Forma de pago");
        comprobante.setNoCertificado("No Certificado");
        comprobante.setCertificado("Certificado");
        comprobante.setSubTotal(new BigDecimal(1));
        comprobante.setDescuento(new BigDecimal(1));
        comprobante.setTipoCambio("1");
        comprobante.setMoneda("MXN");
        comprobante.setTotal(new BigDecimal(1));
        comprobante.setTipoDeComprobante("Tipo");
        comprobante.setMetodoDePago("Metodo");
        comprobante.setLugarExpedicion("Lugar");

        comprobante.getEmisor().setNombre("Emisor");
        comprobante.getEmisor().setRfc("RFC");
        comprobante.getRegimenFiscal().setRegimen("Regimen");
        comprobante.getReceptor().setRfc("RFC Receptor");
        comprobante.getReceptor().setNombre("Nombre Receptor");
        comprobante.getConceptos().getConcepto().setCantidad(1);
        comprobante.getConceptos().getConcepto().setDescripcion("Descripcion");
        comprobante.getConceptos().getConcepto().setImporte(new BigDecimal(21));
        comprobante.getConceptos().getConcepto().setUnidad("Unidad");
        comprobante.getConceptos().getConcepto().setValorUnitario(new BigDecimal(21));
        comprobante.getImpuestos();

        Complemento complemento = new Complemento();

        Nomina nomina = new Nomina();
        nomina.setVersion("1.2");
        nomina.setTipoNomina("Ordinaria");

        complemento.setNomina(nomina);
        comprobante.setComplemento(complemento);



        timbradoNomina.generaXml();

    }
}
