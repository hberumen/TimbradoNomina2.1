
import me.hberumen.nomina.bd.mappers.NominaMapper;
import me.hberumen.nomina.modelo.*;
import me.hberumen.nomina.modelo.jtd.*;
import me.hberumen.nomina.util.Eutil;
import mx.gob.sat.sitioInternet.cfd.catalogos.CEstado;
import mx.gob.sat.sitioInternet.cfd.catalogos.CRegimenFiscal;
import mx.gob.sat.sitioInternet.cfd.catalogos.nomina.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoContrato.*;
import static mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoNomina.*;


/**
 * Created by hberumen on 07/12/16.
 */
public class ImplNominaMapperTest implements NominaMapper {

    private BigInteger Id = new BigInteger("1");
    private BigDecimal Dinero = new BigDecimal("100.0");

    public List<ComprobanteDb> seleccionarComprobantePorAgrupa(String agrupa) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
        List<ComprobanteDb> comprobanteList = new ArrayList<ComprobanteDb>();
        ComprobanteDb comprobante = new ComprobanteDb();

        comprobante.setIdComprobante(Id);
        comprobante.setVersion(Eutil.COMPROBANTE_VERSION.getValor());
        comprobante.setSerie("Serie");
        comprobante.setFolio("Folio");
        comprobante.setFecha(sdf.format(new Date()));
        comprobante.setSello("Sello");
        comprobante.setFormaDePago(Eutil.COMPROBANTE_FORMA_DE_PAGO.getValor());
        comprobante.setNoCertificado("No Certificado");
        comprobante.setCertificado("Certificado");
        comprobante.setSubTotal(new BigDecimal(1));
        comprobante.setDescuento(new BigDecimal(1));
        comprobante.setTipoCambio(Eutil.COMPROBANTE_TIPO_CAMBIO.getValor());
        comprobante.setMoneda(Eutil.COMPROBANTE_MONEDA.getValor());
        comprobante.setTotal(new BigDecimal(1));
        comprobante.setTipoDeComprobante("Tipo");
        comprobante.setMetodoDePago(Eutil.COMPROBANTE_METODO_DE_PAGO.getValor());
        comprobante.setLugarExpedicion("Lugar");
        comprobanteList.add(comprobante);

        return comprobanteList;

    }

    public NominaDb getNominaFromIdComprobante(BigInteger idComprobante) {

        NominaDb nomina = new NominaDb();
        nomina.setIdComprobante(Id);
        nomina.setIdNomina(Id);
        nomina.setVersion(Eutil.NOMINA_VERSION.getValor());
        nomina.setTipoNomina(ORDINARIA);
        nomina.setFechaPago(new Date());
        nomina.setFechaInicialPago(new Date());
        nomina.setFechaFinalPago(new Date());
        nomina.setNumDiasPagados(15.0);
        nomina.setTotalPercepciones(new BigDecimal("100.00"));
        nomina.setTotalDeducciones(new BigDecimal("100.00"));
        nomina.setTotalOtrosPagos(new BigDecimal("100.00"));

        return nomina;
    }

    public EmisorDb getEmisorActivo() {

        EmisorDb emisor = new EmisorDb();
        emisor.setIdEmisor(new Integer(1));
        emisor.setRfc("UAZ680906NI4");
        emisor.setNombre("UNIVERSIDAD AUTONOMA DE ZACATECAS");
        emisor.setRegistroPatronal(null);
        emisor.setRfcPatronOrigen(null);

        return emisor;

    }

    public EmisorDb getEmisorActivoNomina() {

        EmisorDb emisor = new EmisorDb();
        emisor.setIdEmisor(new Integer(1));
        emisor.setRfc(null);
        emisor.setNombre(null);
        emisor.setRegistroPatronal("5525665412");
        emisor.setRfcPatronOrigen(null);

        return emisor;
    }

    public RegimenFiscalDb getRegimenFiscalPorIdEmisor(int idEmisor) {

        RegimenFiscalDb regimenFiscal = new RegimenFiscalDb();
        regimenFiscal.setRegimen(String.valueOf(CRegimenFiscal.INT_X_603));
        regimenFiscal.setIdEmisor(1);
        regimenFiscal.setIdRegimenFiscal(1);

        return regimenFiscal;
    }

    public ReceptorDb getReceptorPorIdComprobante(BigInteger idComprobante) {

        ReceptorDb receptor = new ReceptorDb();
        receptor.setIdReceptor(Id);
        receptor.setIdComprobante(Id);
        receptor.setRfc("BEMH87091223E");
        receptor.setNombre("BERUMEN MORENO HECTOR");


        return receptor;
    }

    public ReceptorDb getReceptorPorIdComprobanteNomina(BigInteger idComprobante) {

        ReceptorDb receptor = new ReceptorDb();
        receptor.setIdReceptor(Id);
        receptor.setIdComprobante(Id);
        receptor.setRfc("BEMH87091223E");
        receptor.setNombre("BERUMEN MORENO HECTOR");
        receptor.setCurp("BEMH87091223E12345");
        receptor.setNumSeguridadSocial("12345678");
        receptor.setFechaInicioRelacionLaboral(new Date());
        receptor.setAntiguedad("5");
        receptor.setTipoContrato(String.valueOf(INT_X_03));
        receptor.setSindicalizado(1);
        receptor.setTipoJornada(String.valueOf(CTipoJornada.INT_X_01));
        receptor.setTipoRegimen(String.valueOf(CTipoRegimen.INT_X_02));
        receptor.setNumEmpleado("100");
        receptor.setDepartamento("CEII");
        receptor.setPuesto("DOCENTE");
        receptor.setRiesgoPuesto(String.valueOf(CRiesgoPuesto.INT_X_1));
        receptor.setPeriodicidadPago("15");
        receptor.setBanco(String.valueOf(CBanco.INT_X_014));
        receptor.setCuentaBancaria("123456789876543210");
        receptor.setSalarioBaseCotApor(new BigDecimal("100.0"));
        receptor.setSalarioDiarioIntegrado(new BigDecimal("100.0"));
        receptor.setClaveEntFed(String.valueOf(CEstado.INT_ZAC));

        return receptor;
    }

    public ConceptoDb seleccionarConceptosPorIdComprobante(BigInteger idComprobante) {

        ConceptoDb concepto = new ConceptoDb();
        concepto.setIdConcepto(Id);
        concepto.setIdComprobante(Id);
        concepto.setCantidad(1);
        concepto.setUnidad(Eutil.CONCEPTO_UNIDAD.getValor());
        concepto.setDescripcion(Eutil.CONCEPTO_DESCRIPCION.getValor());
        concepto.setValorUnitario(new BigDecimal("100.00"));
        concepto.setImporte(new BigDecimal("100.00"));

        return concepto;
    }

    public EntidadSNFCDb seleccionarEntidadSNFCPorIdNomina(BigInteger idNomina) {

        EntidadSNFCDb entidadSNFC = new EntidadSNFCDb();
        entidadSNFC.setIdEntidadSnfc(Id);
        entidadSNFC.setIdNomina(Id);
        entidadSNFC.setOrigenRecurso("IF");
        entidadSNFC.setMontoRecursoPropio(new BigDecimal("100.00"));

        return entidadSNFC;
    }

    public SubContratacion seleccionarSubContratacionPorIdNomina(BigInteger idNomina) {

        return null;
    }

    public PercepcionesDb seleccionarPercepcionesPorIdNomina(BigInteger idNomina) {

        PercepcionesDb percepciones = new PercepcionesDb();
        percepciones.setIdPercepciones(Id);
        percepciones.setIdNomina(Id);
        percepciones.setTotalSueldos(Dinero);
        percepciones.setTotalSeparacionIndemnizacion(Dinero);
        percepciones.setTotalJubilacionPensionRetiro(Dinero);
        percepciones.setTotalGravado(Dinero);
        percepciones.setTotalExento(Dinero);

        return percepciones;
    }

    public List<PercepcionDb> seleccionarPercepcionPorIdPercepciones(BigInteger idPercepcion) {

        List<PercepcionDb> percepcionList = new ArrayList<PercepcionDb>();

        PercepcionDb percepcion = new PercepcionDb();
        percepcion.setIdPercepcion(Id);
        percepcion.setIdPercepciones(Id);
        percepcion.setTipoPercepcion(String.valueOf(CTipoPercepcion.INT_X_001));
        percepcion.setClave("CLAVE 1");
        percepcion.setConcepto("CONCEPTO 1");
        percepcion.setImporteGravado(Dinero);
        percepcion.setImporteExento(Dinero);

        percepcionList.add(percepcion);

        percepcion = new PercepcionDb();
        percepcion.setIdPercepcion(Id);
        percepcion.setIdPercepciones(Id);
        percepcion.setTipoPercepcion(String.valueOf(CTipoPercepcion.INT_X_002));
        percepcion.setClave("CLAVE 2");
        percepcion.setConcepto("CONCEPTO 2");
        percepcion.setImporteGravado(Dinero);
        percepcion.setImporteExento(Dinero);

        percepcionList.add(percepcion);



        return  percepcionList;
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

    public DeduccionesDb seleccionarDeduccionesPorIdNomina(BigInteger idNomina) {

        DeduccionesDb deducciones = new DeduccionesDb();
        deducciones.setIdDeducciones(Id);
        deducciones.setIdNomina(Id);
        deducciones.setTotalOtrasDeducciones(Dinero);
        deducciones.setTotalImpuestosRetenidos(Dinero);

        return deducciones;

    }

    public List<DeduccionDb> seleccionarDeduccionPorIdDeducciones(BigInteger idDeducciones) {

        List<DeduccionDb> deduccionList = new ArrayList<DeduccionDb>();
        DeduccionDb deduccion = new DeduccionDb();
        deduccion.setIdDeduccion(Id);
        deduccion.setIdDeducciones(Id);
        deduccion.setTipoDeduccion(String.valueOf(CTipoDeduccion.INT_X_001));
        deduccion.setClave("Clave 1");
        deduccion.setConcepto("Concepto 1");
        deduccion.setImporte(Dinero);

        deduccionList.add(deduccion);

        deduccion = new DeduccionDb();
        deduccion.setIdDeduccion(Id);
        deduccion.setIdDeducciones(Id);
        deduccion.setTipoDeduccion(String.valueOf(CTipoDeduccion.INT_X_001));
        deduccion.setClave("Clave 2");
        deduccion.setConcepto("Concepto 2");
        deduccion.setImporte(Dinero);

        deduccionList.add(deduccion);

        return deduccionList;
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
