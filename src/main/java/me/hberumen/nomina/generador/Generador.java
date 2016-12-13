package me.hberumen.nomina.generador;

import me.hberumen.nomina.bd.mappers.NominaMapper;
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
        nomina = nominaMapper.getNominaFromIdComprobante();
        complemento.setNomina(nomina);

        nomina.setEmisor(emisorDao);
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
        DeduccionesDao deduccionesDao = new DeduccionesDao(nomina.getIdNomina());
        deduccionesDao = deduccionesDao.seleccionarDeduccionesPorIdNomina();
        nomina.setDeducciones(deduccionesDao);

        DeduccionDao deduccionDao = new DeduccionDao(deduccionesDao.getIdDeducciones());

    }

    private void setSeparacionIndemnizacionNomina() {
        SeparacionIndemnizacionDao separacionIndemnizacionDao = new SeparacionIndemnizacionDao(nomina.getIdNomina());
        SeparacionIndemnizacion separacionIndemnizacion = separacionIndemnizacionDao.seleccionarSeparacionIndemnizacionPorIdNomina();
        nomina.setSeparacionIndemnizacion(separacionIndemnizacion);
    }

    private void setJubilacionPensionRetiroNomina() {
        JubilacionPensionRetiroDao jubilacionPensionRetiroDao = new JubilacionPensionRetiroDao(nomina.getIdNomina());
        JubilacionPensionRetiro jubilacionPensionRetiro = jubilacionPensionRetiroDao.seleccionarJubilacionPensionRetiroPorIdNomina();
        nomina.setJubilacionPensionRetiro(jubilacionPensionRetiro);
    }

    private void setHorasExtraNomina() {
        HorasExtraDao horasExtraDao = new HorasExtraDao(nomina.getIdComprobante());
        HorasExtra horasExtra = new HorasExtra();
        nomina.setHorasExtra(horasExtra);
    }

    private void setAccionesOTitulosNomina() {
        AccionesOTitulosDao accionesOTitulosDao = new AccionesOTitulosDao(nomina.getIdNomina());
        AccionesOTitulos accionesOTitulos = accionesOTitulosDao.selecionarAccionesOTitulosPorIdNomina();
        nomina.setAccionesOTitulos(accionesOTitulos);
    }

    private void setPercepcionesNomina() {
        PercepcionesDao percepcionesDao = new PercepcionesDao(nomina.getIdNomina());
        nomina.setPercepciones(percepcionesDao);

        PercepcionDao percepcionDao = new PercepcionDao(percepcionesDao.getIdPercepciones());
        List<Percepcion>  listPercepcion = percepcionDao.seleccionarPercepcionPorIdPercepciones();

        percepcionesDao.setPercepcion(listPercepcion);

    }

    private void setSubContratacionNomina() {
        SubContratacionDao subContratacionDao = new SubContratacionDao(nomina.getIdNomina());
        SubContratacion subContratacion = subContratacionDao.seleccionarSubContratacionPorIdNomina();
        nomina.setSubContratacion(subContratacion);

    }

    private void setEntidadSNFCNomina() {
        EntidadSNFCDao entidadSNFCDao = new EntidadSNFCDao(nomina.getIdNomina());
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
