package me.hberumen.nomina.bd.mappers;

import me.hberumen.nomina.modelo.*;
import me.hberumen.nomina.modelo.jtd.*;

import java.math.BigInteger;
import java.util.List;

public interface NominaMapper {

    public List<ComprobanteDb> seleccionarComprobantePorAgrupa(BigInteger agrupa);
    public NominaDb getNominaFromIdComprobante(BigInteger idComprobante);
    public EmisorDb getEmisorActivo();
    public EmisorDb getEmisorActivoNomina();
    public RegimenFiscal getRegimenFiscalPorIdEmisor(int idEmisor);
    public ReceptorDb getReceptorPorIdComprobante(BigInteger idComprobante);
    public ReceptorDb getReceptorPorIdComprobanteNomina(BigInteger idComprobante);
    public Concepto seleccionarConceptosPorIdComprobante();
    public EntidadSNFCDb seleccionarEntidadSNFCPorIdNomina(BigInteger idNomina);
    public SubContratacionDb seleccionarSubContratacionPorIdNomina(BigInteger idNomina);
    public PercepcionesDb seleccionarPercepcionesPorIdNomina(BigInteger idNomina);
    public List<PercepcionDb> seleccionarPercepcionPorIdPercepciones(BigInteger idPercepcion);
    public AccionesOTitulosDb selecionarAccionesOTitulosPorIdNomina(BigInteger idNomina);
    public HorasExtraDb seleccionarHorasExtraPorIdNomina(BigInteger idNomina);
    public JubilacionPensionRetiroDb seleccionarJubilacionPensionRetiroPorIdNomina(BigInteger idNomina);
    public SeparacionIndemnizacionDb seleccionarSeparacionIndemnizacionPorIdNomina(BigInteger idNomina);
    public DeduccionesDb seleccionarDeduccionesPorIdNomina(BigInteger idNomina);
    public List<DeduccionDb> seleccionarDeduccionPorIdDeducciones(BigInteger idDeducciones);
    public IncapacidadDb seleccionarIncapacidadPorIdNomina(BigInteger idNomina);
    public OtroPagoDb seleccionarOtroPagoPorIdNomina(BigInteger idNomina);
    public SubsidioAlEmpleoDb seleccionarSubsidioPorIdNomina(BigInteger idNomina);
    public CompensacionSaldosAFavorDb seleccionarCompensacionPorIdNomina(BigInteger idNomina);

}
