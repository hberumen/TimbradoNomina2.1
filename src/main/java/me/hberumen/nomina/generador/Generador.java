package me.hberumen.nomina.generador;

import me.hberumen.nomina.bd.mappers.NominaMapper;
import me.hberumen.nomina.modelo.*;

import java.util.List;

/**
 * Created by hberumen on 01/12/16.
 */
public class Generador {

    private Comprobante comprobante;
    private Emisor emisor;
    private Receptor receptor;
    private Complemento complemento;
    private Nomina nomina;
    private NominaMapper nominaMapper;

    public Generador(Comprobante comprobante, NominaMapper nominaMapper) {
        this.comprobante = comprobante;
        this.nominaMapper = nominaMapper;
    }

    public void generaCfdiNomina(){

        setEmisor();
        setRegimenFiscal();
        setReceptor();
        setConceptos();
        setImpuestos();
        setComplemento();
        setComplementoNomina();

    }

    private void setComplementoNomina() {
        nomina = new Nomina();
        nomina.setIdComprobante(comprobante.getIdComprobante());
        nomina = nominaMapper.getNominaFromIdComprobante(comprobante.getIdComprobante());
        complemento.setNomina(nomina);

        nomina.setEmisor(emisor);
        nomina.setReceptor(receptor);

        setEntidadSNFCNomina();
        setSubContratacionNomina();
        setPercepcionesNomina();
        setAccionesOTitulosNomina();
        setHorasExtraNomina();
        setJubilacionPensionRetiroNomina();
        setSeparacionIndemnizacionNomina();
        setDeduccionesNomina();
    }

    private void setDeduccionesNomina() {
        Deducciones deducciones = nominaMapper.seleccionarDeduccionesPorIdNomina(nomina.getIdNomina());
        nomina.setDeducciones(deducciones);

        List<Deduccion> deduccion = nominaMapper.seleccionarDeduccionPorIdDeducciones(deducciones.getIdDeducciones());
        deducciones.setDeduccion(deduccion);

    }

    private void setSeparacionIndemnizacionNomina() {
        SeparacionIndemnizacion separacionIndemnizacion = nominaMapper.seleccionarSeparacionIndemnizacionPorIdNomina(nomina.getIdNomina());
        nomina.setSeparacionIndemnizacion(separacionIndemnizacion);
    }

    private void setJubilacionPensionRetiroNomina() {
        JubilacionPensionRetiro jubilacionPensionRetiro = nominaMapper.seleccionarJubilacionPensionRetiroPorIdNomina(nomina.getIdNomina());
        nomina.setJubilacionPensionRetiro(jubilacionPensionRetiro);
    }

    private void setHorasExtraNomina() {
        HorasExtra horasExtra = nominaMapper.seleccionarHorasExtraPorIdNomina(nomina.getIdNomina());
        nomina.setHorasExtra(horasExtra);
    }

    private void setAccionesOTitulosNomina() {
        AccionesOTitulos accionesOTitulos = nominaMapper.selecionarAccionesOTitulosPorIdNomina(nomina.getIdNomina());
        nomina.setAccionesOTitulos(accionesOTitulos);
    }

    private void setPercepcionesNomina() {
        Percepciones percepciones = nominaMapper.seleccionarPercepcionesPorIdNomina(nomina.getIdNomina());
        nomina.setPercepciones(percepciones);

        List<Percepcion>  listPercepcion = nominaMapper.seleccionarPercepcionPorIdPercepciones(percepciones.getIdPercepciones());

        percepciones.setPercepcion(listPercepcion);

    }

    private void setSubContratacionNomina() {
        SubContratacion subContratacion = nominaMapper.seleccionarSubContratacionPorIdNomina(nomina.getIdNomina());
        nomina.setSubContratacion(subContratacion);

    }

    private void setEntidadSNFCNomina() {
        EntidadSNFC entidadSNFCDao = nominaMapper.seleccionarEntidadSNFCPorIdNomina(nomina.getIdNomina());
        nomina.setEntidadSNFC(entidadSNFCDao);
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
        comprobante.setReceptor(receptor);
    }

    private void setRegimenFiscal() {
        RegimenFiscal regimenFiscal = nominaMapper.getRegimenFiscalPorIdEmisor(emisor.getIdEmisor());
        comprobante.setRegimenFiscal(regimenFiscal);
    }

    private void setEmisor() {
        emisor = nominaMapper.getEmisorActivo();
        emisor.setRegistroPatronal(null);
        comprobante.setEmisor(emisor);
    }
}
