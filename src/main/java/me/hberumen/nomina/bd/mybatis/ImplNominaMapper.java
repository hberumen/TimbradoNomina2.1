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


    public List<ComprobanteDb> seleccionarComprobantePorAgrupa(BigInteger agrupa) {
        return null;
    }
    public NominaDb getNominaFromIdComprobante(BigInteger idComprobante) {
        return null;
    }
    public EmisorDb getEmisorActivo() {
        return null;
    }
    public EmisorDb getEmisorActivoNomina() {
        return null;
    }
    public RegimenFiscal getRegimenFiscalPorIdEmisor(int idEmisor) {
        return null;
    }
    public ReceptorDb getReceptorPorIdComprobante(BigInteger idComprobante) {
        return null;
    }
    public ReceptorDb getReceptorPorIdComprobanteNomina(BigInteger idComprobante) {
        return null;
    }
    public Concepto seleccionarConceptosPorIdComprobante() {
        return null;
    }
    public EntidadSNFCDb seleccionarEntidadSNFCPorIdNomina(BigInteger idNomina) {
        return null;
    }
    public SubContratacionDb seleccionarSubContratacionPorIdNomina(BigInteger idNomina) {
        return null;
    }
    public PercepcionesDb seleccionarPercepcionesPorIdNomina(BigInteger idNomina) {
        return null;
    }
    public List<PercepcionDb> seleccionarPercepcionPorIdPercepciones(BigInteger idPercepcion) {
        return null;
    }
    public AccionesOTitulosDb selecionarAccionesOTitulosPorIdNomina(BigInteger idNomina) {
        return null;
    }
    public HorasExtraDb seleccionarHorasExtraPorIdNomina(BigInteger idNomina) {
        return null;
    }
    public JubilacionPensionRetiroDb seleccionarJubilacionPensionRetiroPorIdNomina(BigInteger idNomina) {
        return null;
    }
    public SeparacionIndemnizacionDb seleccionarSeparacionIndemnizacionPorIdNomina(BigInteger idNomina) {
        return null;
    }
    public DeduccionesDb seleccionarDeduccionesPorIdNomina(BigInteger idNomina) {
        return null;
    }
    public List<DeduccionDb> seleccionarDeduccionPorIdDeducciones(BigInteger idDeducciones) {
        return null;
    }
    public IncapacidadDb seleccionarIncapacidadPorIdNomina(BigInteger idNomina) {
        return null;
    }
    public OtroPagoDb seleccionarOtroPagoPorIdNomina(BigInteger idNomina) {
        return null;
    }
    public SubsidioAlEmpleoDb seleccionarSubsidioPorIdNomina(BigInteger idNomina) {
        return null;
    }
    public CompensacionSaldosAFavorDb seleccionarCompensacionPorIdNomina(BigInteger idNomina) {
        return null;
    }
}
