package me.hberumen.nomina.generador;

import me.hberumen.nomina.bd.mappers.NominaMapper;
import me.hberumen.nomina.modelo.*;
import me.hberumen.nomina.modelo.jtd.*;
import me.hberumen.nomina.wsTimbrado.Config;

import javax.xml.XMLConstants;
import javax.xml.bind.*;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hberumen on 01/12/16.
 */
public class Generador {

    private ComprobanteDb comprobante;
    private EmisorDb emisor;
    private Receptor receptor;
    private Complemento complemento;
    private Nomina nomina;
    private NominaDb nominaDb;
    private NominaMapper nominaMapper;

    public Generador(ComprobanteDb comprobante, NominaMapper nominaMapper) {
        this.comprobante = comprobante;
        this.nominaMapper = nominaMapper;
    }

    public void generaCfdiNomina(){

        setEmisor();
        setReceptor();
        setConceptos();
        setImpuestos();
        setComplemento();
        setComplementoNomina();

    }

    private void setComplementoNomina(){
        nominaDb = new NominaDb();
        nominaDb.setIdComprobante(comprobante.getIdComprobante());
        nomina = nominaMapper.getNominaFromIdComprobante(comprobante.getIdComprobante());
        complemento.setNomina(nomina);

        Emisor emisorM = getEmisorNomina();
        Receptor receptorM = getReceptorNomina();

        setEntidadSNFCNomina(emisorM);
        setSubContratacionNomina();
        setPercepcionesNomina();
        setAccionesOTitulosNomina();
        setHorasExtraNomina();
        setJubilacionPensionRetiroNomina();
        setSeparacionIndemnizacionNomina();
        setDeduccionesNomina();
    }

    private Receptor getReceptorNomina(){
        Receptor receptorM = nominaMapper.getReceptorPorIdComprobanteNomina(comprobante.getIdComprobante());
        nomina.setReceptor(receptorM);
        return receptorM;
    }

    private Emisor getEmisorNomina() {
        Emisor emisorM = nominaMapper.getEmisorActivoNomina();
        nomina.setEmisor(emisorM);
        return emisorM;
    }

    private void setDeduccionesNomina() {
        DeduccionesDb deducciones = nominaMapper.seleccionarDeduccionesPorIdNomina(nominaDb.getIdNomina());
        Deducciones deduccionesM = deducciones;
        nomina.setDeducciones(deduccionesM);

        List<DeduccionDb> deduccion = nominaMapper.seleccionarDeduccionPorIdDeducciones(deducciones.getIdDeducciones());
        List<Deduccion> deduccionList = new ArrayList<Deduccion>();
        for(Deduccion deduccion1 : deduccion){
            deduccionList.add(deduccion1);
        }
        deducciones.setDeduccion(deduccionList);

    }

    private void setSeparacionIndemnizacionNomina() {
        SeparacionIndemnizacion separacionIndemnizacion = nominaMapper.seleccionarSeparacionIndemnizacionPorIdNomina(nominaDb.getIdNomina());
        nomina.setSeparacionIndemnizacion(separacionIndemnizacion);
    }

    private void setJubilacionPensionRetiroNomina() {
        JubilacionPensionRetiro jubilacionPensionRetiro = nominaMapper.seleccionarJubilacionPensionRetiroPorIdNomina(nominaDb.getIdNomina());
        nomina.setJubilacionPensionRetiro(jubilacionPensionRetiro);
    }

    private void setHorasExtraNomina() {
        HorasExtra horasExtra = nominaMapper.seleccionarHorasExtraPorIdNomina(nominaDb.getIdNomina());
        nomina.setHorasExtra(horasExtra);
    }

    private void setAccionesOTitulosNomina() {
        AccionesOTitulos accionesOTitulos = nominaMapper.selecionarAccionesOTitulosPorIdNomina(nominaDb.getIdNomina());
        nomina.setAccionesOTitulos(accionesOTitulos);
    }

    private void setPercepcionesNomina() {
        PercepcionesDb percepciones = nominaMapper.seleccionarPercepcionesPorIdNomina(nominaDb.getIdNomina());
        Percepciones percepcionesM = percepciones;
        nomina.setPercepciones(percepcionesM);

        List<PercepcionDb>  listPercepcion = nominaMapper.seleccionarPercepcionPorIdPercepciones(percepciones.getIdPercepciones());
        List<Percepcion> percepcionList = new ArrayList<Percepcion>();
        for (Percepcion percepcion : listPercepcion){
            percepcionList.add(percepcion);
        }

        percepciones.setPercepcion(percepcionList);

    }

    private void setSubContratacionNomina() {
        SubContratacion subContratacion = nominaMapper.seleccionarSubContratacionPorIdNomina(nominaDb.getIdNomina());
        nomina.getReceptor().setSubContratacion(subContratacion);

    }

    private void setEntidadSNFCNomina(Emisor emisor) {
        EntidadSNFC entidadSNFCDao = nominaMapper.seleccionarEntidadSNFCPorIdNomina(nominaDb.getIdNomina());
        emisor.setEntidadSNCF(entidadSNFCDao);
    }



    private void setComplemento() {
        complemento = new Complemento();
        comprobante.setComplemento(complemento);
    }

    private void setImpuestos() {
        Impuestos impuestos = new Impuestos();
        comprobante.setImpuestos(impuestos);
    }

    private void setConceptos() {
        Conceptos conceptos = new Conceptos();
        comprobante.setConceptos(conceptos);

        Concepto concepto = nominaMapper.seleccionarConceptosPorIdComprobante(comprobante.getIdComprobante());
        conceptos.setConcepto(concepto);
    }

    private void setReceptor() {
        receptor = nominaMapper.getReceptorPorIdComprobante(comprobante.getIdComprobante());
        Receptor receptorM = receptor;
        comprobante.setReceptor(receptorM);
    }

    private void setRegimenFiscal(Emisor emisorM) {
        RegimenFiscal regimenFiscal = nominaMapper.getRegimenFiscalPorIdEmisor(emisor.getIdEmisor());
        emisorM.setRegimenFiscal(regimenFiscal);
    }

    private void setEmisor() {
        emisor = nominaMapper.getEmisorActivo();
        emisor.setRegistroPatronal(null);
        Emisor emisorM = emisor;
        setRegimenFiscal(emisorM);
        comprobante.setEmisor(emisorM);
    }

    public String generaXml() {

        Comprobante comprobanteMar = comprobante;

        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(Comprobante.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, Comprobante.SCHEMA_SAT + Nomina.SCHEMA_NOMINA);

            StringWriter xml = new StringWriter();
            marshaller.marshal(comprobanteMar, xml);
            return xml.toString();

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return new String();
    }

    public void validarXml() {

        Comprobante comprobanteMar = comprobante;

        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(Comprobante.class);
            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = sf.newSchema(new File(Config.PATH_SAT+Config.COMPROBANTE));
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, Comprobante.SCHEMA_SAT + Nomina.SCHEMA_NOMINA);
            marshaller.setEventHandler(new NominaValidationEventHandler());
            marshaller.setSchema(schema);
            marshaller.marshal(comprobanteMar, System.out);
            marshaller.marshal(comprobanteMar, new File("Comprobante.xml"));

        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (org.xml.sax.SAXException e) {
            e.printStackTrace();
        }
    }

    private class NominaValidationEventHandler implements ValidationEventHandler {

        public boolean handleEvent(ValidationEvent event) {
            System.out.println("\nEVENT");
            System.out.println("SEVERITY:  " + event.getSeverity());
            System.out.println("MESSAGE:  " + event.getMessage());
            System.out.println("LINKED EXCEPTION:  " + event.getLinkedException());
            System.out.println("LOCATOR");
            System.out.println("    LINE NUMBER:  " + event.getLocator().getLineNumber());
            System.out.println("    COLUMN NUMBER:  " + event.getLocator().getColumnNumber());
            System.out.println("    OFFSET:  " + event.getLocator().getOffset());
            System.out.println("    OBJECT:  " + event.getLocator().getObject());
            System.out.println("    NODE:  " + event.getLocator().getNode());
            System.out.println("    URL:  " + event.getLocator().getURL());
            return true;
        }
    }
}
