package me.hberumen.nomina.bd.mybatis;

import me.hberumen.nomina.bd.mappers.NominaMapper;
import me.hberumen.nomina.modelo.*;
import me.hberumen.nomina.modelo.jtd.*;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by hberumen on 07/12/16.
 */
public class ImplNominaMapper implements NominaMapper {

    public Nomina getNominaFromIdComprobante() {
        return null;
    }

    public List<ComprobanteDb> seleccionarComprobantePorAgrupa(String agrupa) {
        return null;
    }

    public Nomina getNominaFromIdComprobante(BigInteger idComprobante) {
        return null;
    }

    public EmisorDb getEmisorActivo() {
        return null;
    }

    public RegimenFiscalDb getRegimenFiscalPorIdEmisor(int idEmisor) {
        return null;
    }

    public ReceptorDb getReceptorPorIdComprobante(BigInteger idComprobante) {
        return null;
    }

    public ReceptorDb getReceptorPorIdComprobanteNomina(BigInteger idComprobante) {
        return null;
    }

    public ConceptoDb seleccionarConceptosPorIdComprobante(BigInteger idComprobante) {
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
