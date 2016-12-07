package me.hberumen.nomina.generador;

import me.hberumen.nomina.dao.*;
import me.hberumen.nomina.modelo.*;

import java.util.List;

/**
 * Created by hberumen on 01/12/16.
 */
public class Generador {

    private Comprobante comprobante;
    private EmisorDao emisorDao;
    private Receptor receptor;
    private Complemento complemento;
    private NominaDao nominadao;

    public Generador(Comprobante comprobante) {
        this.comprobante = comprobante;
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
        nominadao = new NominaDao(comprobante.getIdComprobante());
        nominadao = nominadao.getNominaFromIdComprobante();
        complemento.setNomina(nominadao);

        nominadao.setEmisor(emisorDao);
        nominadao.setReceptor(receptor);

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
        DeduccionesDao deduccionesDao = new DeduccionesDao(nominadao.getIdNomina());
        deduccionesDao = deduccionesDao.seleccionarDeduccionesPorIdNomina();
        nominadao.setDeducciones(deduccionesDao);

        DeduccionDao deduccionDao = new DeduccionDao(deduccionesDao.getIdDeducciones());

    }

    private void setSeparacionIndemnizacionNomina() {
        SeparacionIndemnizacionDao separacionIndemnizacionDao = new SeparacionIndemnizacionDao(nominadao.getIdNomina());
        SeparacionIndemnizacion separacionIndemnizacion = separacionIndemnizacionDao.seleccionarSeparacionIndemnizacionPorIdNomina();
        nominadao.setSeparacionIndemnizacion(separacionIndemnizacion);
    }

    private void setJubilacionPensionRetiroNomina() {
        JubilacionPensionRetiroDao jubilacionPensionRetiroDao = new JubilacionPensionRetiroDao(nominadao.getIdNomina());
        JubilacionPensionRetiro jubilacionPensionRetiro = jubilacionPensionRetiroDao.seleccionarJubilacionPensionRetiroPorIdNomina();
        nominadao.setJubilacionPensionRetiro(jubilacionPensionRetiro);
    }

    private void setHorasExtraNomina() {
        HorasExtraDao horasExtraDao = new HorasExtraDao(nominadao.getIdComprobante());
        HorasExtra horasExtra = new HorasExtra();
        nominadao.setHorasExtra(horasExtra);
    }

    private void setAccionesOTitulosNomina() {
        AccionesOTitulosDao accionesOTitulosDao = new AccionesOTitulosDao(nominadao.getIdNomina());
        AccionesOTitulos accionesOTitulos = accionesOTitulosDao.selecionarAccionesOTitulosPorIdNomina();
        nominadao.setAccionesOTitulos(accionesOTitulos);
    }

    private void setPercepcionesNomina() {
        PercepcionesDao percepcionesDao = new PercepcionesDao(nominadao.getIdNomina());
        nominadao.setPercepciones(percepcionesDao);

        PercepcionDao percepcionDao = new PercepcionDao(percepcionesDao.getIdPercepciones());
        List<Percepcion>  listPercepcion = percepcionDao.seleccionarPercepcionPorIdPercepciones();

        percepcionesDao.setPercepcion(listPercepcion);

    }

    private void setSubContratacionNomina() {
        SubContratacionDao subContratacionDao = new SubContratacionDao(nominadao.getIdNomina());
        SubContratacion subContratacion = subContratacionDao.seleccionarSubContratacionPorIdNomina();
        nominadao.setSubContratacion(subContratacion);

    }

    private void setEntidadSNFCNomina() {
        EntidadSNFCDao entidadSNFCDao = new EntidadSNFCDao(nominadao.getIdNomina());
        nominadao.setEntidadSNFC(entidadSNFCDao);
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

        ConceptoDao conceptoDao = new ConceptoDao(comprobante.getIdComprobante());
        Concepto concepto = conceptoDao.seleccionarConceptosPorIdComprobante();
        conceptos.setConcepto(concepto);
    }

    private void setReceptor() {
        ReceptorDao receptorDao = new ReceptorDao(comprobante.getIdComprobante());
        receptor = receptorDao.getReceptorPorIdComprobante();
        comprobante.setReceptor(receptor);
    }

    private void setRegimenFiscal() {
        RegimenFiscalDao regimenFiscalDao = new RegimenFiscalDao(emisorDao.getIdEmisor());
        RegimenFiscal regimenFiscal = regimenFiscalDao.getRegimenFiscalPorIdEmisor();
        comprobante.setRegimenFiscal(regimenFiscal);
    }

    private void setEmisor() {
        emisorDao = new EmisorDao();
        emisorDao = emisorDao.getEmisorActivo();
        emisorDao.setRegistroPatronal(null);
        comprobante.setEmisor(emisorDao);
    }
}
