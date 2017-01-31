
import me.hberumen.nomina.bd.mappers.NominaMapper;
import me.hberumen.nomina.modelo.*;
import me.hberumen.nomina.modelo.jtd.*;
import me.hberumen.nomina.util.Eutil;
import mx.gob.sat.catalogos.nomina.CTipoNomina;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 * Created by hberumen on 07/12/16.
 */
public class ImplNominaMapperTest implements NominaMapper {

    private BigInteger Id = new BigInteger("1");
    private BigDecimal Dinero = new BigDecimal("100.0");

    public List<ComprobanteDb> seleccionarComprobantePorAgrupa(String agrupa) {

        List<ComprobanteDb> comprobanteList = new ArrayList<ComprobanteDb>();
        ComprobanteDb comprobante = new ComprobanteDb();

        comprobante.setIdComprobante(Id);
        comprobante.setVersion(Eutil.COMPROBANTE_VERSION.getValor());
        comprobante.setSerie("Serie");
        comprobante.setFolio("Folio");
        comprobante.setFecha(new Date());
        comprobante.setSello("Sello");
        comprobante.setFormaDePago(Eutil.COMPROBANTE_FORMA_DE_PAGO.getValor());
        comprobante.setNoCertificado("No Certificado");
        comprobante.setCertificado("Certificado");
        comprobante.setSubTotal(new BigDecimal(100));
        comprobante.setDescuento(new BigDecimal(1));
        comprobante.setTipoCambio(Eutil.COMPROBANTE_TIPO_CAMBIO.getValor());
        comprobante.setMoneda(Eutil.COMPROBANTE_MONEDA.getValor());
        comprobante.setTotal(new BigDecimal(99));
        comprobante.setTipoDeComprobante(Eutil.COMPROBANTE_TIPO_COMPROBANTE.getValor());
        comprobante.setMetodoDePago(Eutil.COMPROBANTE_METODO_DE_PAGO.getValor());
        comprobante.setLugarExpedicion("98600");
        comprobanteList.add(comprobante);

        return comprobanteList;

    }

    public NominaDb getNominaFromIdComprobante(BigInteger idComprobante) {

        NominaDb nomina = new NominaDb();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar fecha = Calendar.getInstance();
        Calendar fechaf = Calendar.getInstance();
        try {
            fecha.setTime(sdf.parse("2017-01-01"));
            fechaf.setTime(sdf.parse("2017-01-15"));

            nomina.setIdComprobante(Id);
            nomina.setIdNomina(Id);
            nomina.setVersion(Eutil.NOMINA_VERSION.getValor());
            nomina.setTipoNomina(CTipoNomina.O.name());
            nomina.setFechaPago(new Date());
            nomina.setFechaInicialPago(fecha.getTime());
            nomina.setFechaFinalPago(fechaf.getTime());
            nomina.setNumDiasPagados(3.141);
            nomina.setTotalPercepciones(new BigDecimal("100.00"));
            nomina.setTotalDeducciones(new BigDecimal("1"));
            nomina.setTotalOtrosPagos(new BigDecimal("0"));

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return nomina;
    }

    public EmisorDb getEmisorActivo() {

        EmisorDb emisor = new EmisorDb();
        emisor.setIdEmisor(new Integer(1));
        emisor.setRfc("TGF680906TR$");
        emisor.setNombre("EMPRESA VIP");
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
        regimenFiscal.setRegimen("603");
        regimenFiscal.setIdEmisor(1);
        regimenFiscal.setIdRegimenFiscal(1);

        return regimenFiscal;
    }

    public ReceptorDb getReceptorPorIdComprobante(BigInteger idComprobante) {

        ReceptorDb receptor = new ReceptorDb();
        receptor.setIdReceptor(Id);
        receptor.setIdComprobante(Id);
        receptor.setRfc("YFGH67120176A");
        receptor.setNombre("RAMON RAMIREZ");


        return receptor;
    }

    public ReceptorDb getReceptorPorIdComprobanteNomina(BigInteger idComprobante) {
        Calendar fecha = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            fecha.setTime(sdf.parse("2012-08-30"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        ReceptorDb receptor = new ReceptorDb();
        receptor.setIdReceptor(Id);
        receptor.setIdComprobante(Id);
        receptor.setRfc(null);
        receptor.setNombre(null);
        receptor.setCurp("MASM020203MDFRNTA6");
        receptor.setNumSeguridadSocial("12345678");
        receptor.setFechaInicioRelacionLaboral(fecha.getTime());
        receptor.setAntiguedad("P228W");
        receptor.setTipoContrato("01");
        receptor.setSindicalizado("Sí");
        receptor.setTipoJornada("02");
        receptor.setTipoRegimen("03");
        receptor.setNumEmpleado("100");
        receptor.setDepartamento("CEII");
        receptor.setPuesto("DOCENTE");
        receptor.setRiesgoPuesto(String.valueOf(1));
        receptor.setPeriodicidadPago("04");
        receptor.setBanco("014");
        receptor.setCuentaBancaria("4524347700");
        receptor.setSalarioBaseCotApor(new BigDecimal("100.0"));
        receptor.setSalarioDiarioIntegrado(new BigDecimal("100.0"));
        receptor.setClaveEntFed("ZAC");

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
        entidadSNFC.setOrigenRecurso("IM");
        entidadSNFC.setMontoRecursoPropio(new BigDecimal("10"));

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
        percepciones.setTotalSeparacionIndemnizacion(null);
        percepciones.setTotalJubilacionPensionRetiro(null);
        percepciones.setTotalGravado(new BigDecimal("0"));
        percepciones.setTotalExento(Dinero);


        return percepciones;
    }

    public List<PercepcionDb> seleccionarPercepcionPorIdPercepciones(BigInteger idPercepcion) {

        List<PercepcionDb> percepcionList = new ArrayList<PercepcionDb>();

        PercepcionDb percepcion = new PercepcionDb();
        percepcion.setIdPercepcion(Id);
        percepcion.setIdPercepciones(Id);
        percepcion.setTipoPercepcion("001");
        percepcion.setClave("001");
        percepcion.setConcepto("CONCEPTO 1");
        percepcion.setImporteGravado(new BigDecimal("0"));
        percepcion.setImporteExento(new BigDecimal("50"));

        percepcionList.add(percepcion);

        percepcion = new PercepcionDb();
        percepcion.setIdPercepcion(Id);
        percepcion.setIdPercepciones(Id);
        percepcion.setTipoPercepcion("001");
        percepcion.setClave("002");
        percepcion.setConcepto("CONCEPTO 2");
        percepcion.setImporteGravado(new BigDecimal("0"));
        percepcion.setImporteExento(new BigDecimal("50"));

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
        deducciones.setTotalOtrasDeducciones(new BigDecimal("0"));
        deducciones.setTotalImpuestosRetenidos(new BigDecimal("1"));

        return deducciones;

    }

    public List<DeduccionDb> seleccionarDeduccionPorIdDeducciones(BigInteger idDeducciones) {

        List<DeduccionDb> deduccionList = new ArrayList<DeduccionDb>();
        DeduccionDb deduccion = new DeduccionDb();
        deduccion.setIdDeduccion(Id);
        deduccion.setIdDeducciones(Id);
        deduccion.setTipoDeduccion("002");
        deduccion.setClave("001");
        deduccion.setConcepto("Concepto 1");
        deduccion.setImporte(new BigDecimal("1"));


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
