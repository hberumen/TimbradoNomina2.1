package me.hberumen.nomina.bd.mappers;

import me.hberumen.nomina.modelo.*;
import me.hberumen.nomina.modelo.jtd.*;

import java.math.BigInteger;
import java.util.List;

public interface NominaMapper {

    public List<ComprobanteDb> seleccionarComprobantePorAgrupa(String agrupa);
    public Nomina getNominaFromIdComprobante(BigInteger idComprobante);
    public EmisorDb getEmisorActivo();
    public RegimenFiscalDb getRegimenFiscalPorIdEmisor(int idEmisor);
    public ReceptorDb getReceptorPorIdComprobante(BigInteger idComprobante);
    public ReceptorDb getReceptorPorIdComprobanteNomina(BigInteger idComprobante);
    public ConceptoDb seleccionarConceptosPorIdComprobante(BigInteger idComprobante);
    public EntidadSNFC seleccionarEntidadSNFCPorIdNomina(BigInteger idNomina);
    public SubContratacion seleccionarSubContratacionPorIdNomina(BigInteger idNomina);
    public Percepciones seleccionarPercepcionesPorIdNomina(BigInteger idNomina);
    public List<Percepcion> seleccionarPercepcionPorIdPercepciones(BigInteger idPercepcion);
    public AccionesOTitulos selecionarAccionesOTitulosPorIdNomina(BigInteger idNomina);
    public HorasExtra seleccionarHorasExtraPorIdNomina(BigInteger idNomina);
    public JubilacionPensionRetiro seleccionarJubilacionPensionRetiroPorIdNomina(BigInteger idNomina);
    public SeparacionIndemnizacion seleccionarSeparacionIndemnizacionPorIdNomina(BigInteger idNomina);
    public Deducciones seleccionarDeduccionesPorIdNomina(BigInteger idNomina);
    public List<Deduccion> seleccionarDeduccionPorIdDeducciones(BigInteger idDeducciones);
    public Incapacidad seleccionarIncapacidadPorIdNomina(BigInteger idNomina);
    public OtroPago seleccionarOtroPagoPorIdNomina(BigInteger idNomina);
    public SubsidioAlEmpleo seleccionarSubsidioPorIdNomina(BigInteger idNomina);
    public CompensacionSaldosAFavor seleccionarCompensacionPorIdNomina(BigInteger idNomina);

}
