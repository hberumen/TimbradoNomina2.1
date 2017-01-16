package me.hberumen.nomina.bd.mybatis;

import me.hberumen.nomina.bd.mappers.NominaMapper;
import me.hberumen.nomina.modelo.*;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by hberumen on 07/12/16.
 */
public class ImplNominaMapper implements NominaMapper {

    public List<Comprobante> seleccionarComprobantePorAgrupa() {
        return null;
    }

    public Nomina getNominaFromIdComprobante() {
        return null;
    }

    public List<Comprobante> seleccionarComprobantePorAgrupa(BigInteger idAgrupa) {
        return null;
    }

    public Nomina getNominaFromIdComprobante(BigInteger idComprobante) {
        return null;
    }

    public Emisor getEmisorActivo() {
        return null;
    }

    public RegimenFiscal getRegimenFiscalPorIdEmisor(int idEmisor) {
        return null;
    }

    public Receptor getReceptorPorIdComprobante(BigInteger idComprobante) {
        return null;
    }

    public Concepto seleccionarConceptosPorIdComprobante(BigInteger idComprobante) {
        return null;
    }

    public EntidadSNFC seleccionarEntidadSNFCPorIdNomina(BigInteger idNomina) {
        return null;
    }

    public SubContratacion seleccionarSubContratacionPorIdNomina(BigInteger idNomina) {
        return null;
    }

    public Percepciones seleccionarPercepcionesPorIdNomina(BigInteger idNomina) {
        return null;
    }

    public List<Percepcion> seleccionarPercepcionPorIdPercepciones(BigInteger idPercepcion) {
        return null;
    }

    public AccionesOTitulos selecionarAccionesOTitulosPorIdNomina(BigInteger idNomina) {
        return null;
    }

    public HorasExtra seleccionarHorasExtraPorIdNomina(BigInteger idNomina) {
        return null;
    }

    public JubilacionPensionRetiro seleccionarJubilacionPensionRetiroPorIdNomina(BigInteger idNomina) {
        return null;
    }

    public SeparacionIndemnizacion seleccionarSeparacionIndemnizacionPorIdNomina(BigInteger idNomina) {
        return null;
    }

    public Deducciones seleccionarDeduccionesPorIdNomina(BigInteger idNomina) {
        return null;
    }

    public List<Deduccion> seleccionarDeduccionPorIdDeducciones(BigInteger idDeducciones) {
        return null;
    }

    public Incapacidad seleccionarIncapacidadPorIdNomina(BigInteger idNomina) {
        return null;
    }

    public OtroPago seleccionarOtroPagoPorIdNomina(BigInteger idNomina) {
        return null;
    }

    public SubsidioAlEmpleo seleccionarSubsidioPorIdNomina(BigInteger idNomina) {
        return null;
    }

    public CompensacionSaldosAFavor seleccionarCompensacionPorIdNomina(BigInteger idNomina) {
        return null;
    }
}
