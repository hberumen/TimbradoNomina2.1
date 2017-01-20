package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by hberumen on 25/11/16.
 */
@XmlRootElement(namespace="http://www.sat.gob.mx/nomina12", name="Nomina")
public class Nomina {

    public static final String SCHEMA_NOMINA = "http://www.sat.gob.mx/nomina12 http://www.sat.gob.mx/sitio_internet/cfd/nomina/nomina12.xsd";

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-mm-dd");


    private String version;
    private String tipoNomina;
    private Date fechaPago;
    private Date fechaInicialPago;
    private Date fechaFinalPago;
    private Double numDiasPagados;
    private BigDecimal totalPercepciones;
    private BigDecimal totalDeducciones;
    private BigDecimal totalOtrosPagos;

    private Emisor emisor;
    private Receptor receptor;
    private EntidadSNFC entidadSNFC;
    private SubContratacion subContratacion;
    private Percepciones percepciones;
    private AccionesOTitulos accionesOTitulos;
    private HorasExtra horasExtra;
    private JubilacionPensionRetiro jubilacionPensionRetiro;
    private SeparacionIndemnizacion separacionIndemnizacion;

    private Deducciones deducciones;
    private Incapacidades incapacidades;
    private OtrosPagos otrosPagos;
    private SubsidioAlEmpleo subsidioAlEmpleo;
    private CompensacionSaldosAFavor compensacionSaldosAFavor;

    public Nomina() {

    }

    @XmlAttribute
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @XmlAttribute
    public String getTipoNomina() {
        return tipoNomina;
    }

    public void setTipoNomina(String tipoNomina) {
        this.tipoNomina = tipoNomina;
    }

    @XmlAttribute
    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    @XmlAttribute
    public Date getFechaInicialPago() {
        return fechaInicialPago;
    }

    public void setFechaInicialPago(Date fechaInicialPago) {
        this.fechaInicialPago = fechaInicialPago;
    }

    @XmlAttribute
    public Date getFechaFinalPago() {
        return fechaFinalPago;
    }

    public void setFechaFinalPago(Date fechaFinalPago) {
        this.fechaFinalPago = fechaFinalPago;
    }

    @XmlAttribute
    public Double getNumDiasPagados() {
        return numDiasPagados;
    }

    public void setNumDiasPagados(Double numDiasPagados) {
        this.numDiasPagados = numDiasPagados;
    }

    @XmlAttribute
    public BigDecimal getTotalPercepciones() {
        return totalPercepciones;
    }

    public void setTotalPercepciones(BigDecimal totalPercepciones) {
        this.totalPercepciones = totalPercepciones;
    }

    @XmlAttribute
    public BigDecimal getTotalDeducciones() {
        return totalDeducciones;
    }

    public void setTotalDeducciones(BigDecimal totalDeducciones) {
        this.totalDeducciones = totalDeducciones;
    }

    @XmlAttribute
    public BigDecimal getTotalOtrosPagos() {
        return totalOtrosPagos;
    }

    public void setTotalOtrosPagos(BigDecimal totalOtrosPagos) {
        this.totalOtrosPagos = totalOtrosPagos;
    }

    @XmlElement(namespace="http://www.sat.gob.mx/nomina12")
    public Emisor getEmisor() {
        return emisor;
    }

    public void setEmisor(Emisor emisor) {
        this.emisor = emisor;
    }

    @XmlElement(namespace="http://www.sat.gob.mx/nomina12")
    public EntidadSNFC getEntidadSNFC() {
        return entidadSNFC;
    }

    public void setEntidadSNFC(EntidadSNFC entidadSNFC) {
        this.entidadSNFC = entidadSNFC;
    }

    @XmlElement(namespace="http://www.sat.gob.mx/nomina12")
    public Receptor getReceptor() {
        return receptor;
    }

    public void setReceptor(Receptor receptor) {
        this.receptor = receptor;
    }

    @XmlElement(namespace="http://www.sat.gob.mx/nomina12")
    public SubContratacion getSubContratacion() {
        return subContratacion;
    }

    public void setSubContratacion(SubContratacion subContratacion) {
        this.subContratacion = subContratacion;
    }

    @XmlElement(namespace="http://www.sat.gob.mx/nomina12")
    public Percepciones getPercepciones() {
        return percepciones;
    }

    public void setPercepciones(Percepciones percepciones) {
        this.percepciones = percepciones;
    }

    @XmlElement(namespace="http://www.sat.gob.mx/nomina12")
    public AccionesOTitulos getAccionesOTitulos() {
        return accionesOTitulos;
    }

    public void setAccionesOTitulos(AccionesOTitulos accionesOTitulos) {
        this.accionesOTitulos = accionesOTitulos;
    }

    @XmlElement(namespace="http://www.sat.gob.mx/nomina12")
    public HorasExtra getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(HorasExtra horasExtra) {
        this.horasExtra = horasExtra;
    }

    @XmlElement(namespace="http://www.sat.gob.mx/nomina12")
    public JubilacionPensionRetiro getJubilacionPensionRetiro() {
        return jubilacionPensionRetiro;
    }

    public void setJubilacionPensionRetiro(JubilacionPensionRetiro jubilacionPensionRetiro) {
        this.jubilacionPensionRetiro = jubilacionPensionRetiro;
    }

    @XmlElement(namespace="http://www.sat.gob.mx/nomina12")
    public SeparacionIndemnizacion getSeparacionIndemnizacion() {
        return separacionIndemnizacion;
    }

    public void setSeparacionIndemnizacion(SeparacionIndemnizacion separacionIndemnizacion) {
        this.separacionIndemnizacion = separacionIndemnizacion;
    }

    @XmlElement(namespace="http://www.sat.gob.mx/nomina12")
    public Deducciones getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(Deducciones deducciones) {
        this.deducciones = deducciones;
    }

    @XmlElement(namespace="http://www.sat.gob.mx/nomina12")
    public Incapacidades getIncapacidades() {
        return incapacidades;
    }

    public void setIncapacidades(Incapacidades incapacidades) {
        this.incapacidades = incapacidades;
    }

    @XmlElement(namespace="http://www.sat.gob.mx/nomina12")
    public OtrosPagos getOtrosPagos() {
        return otrosPagos;
    }

    public void setOtrosPagos(OtrosPagos otrosPagos) {
        this.otrosPagos = otrosPagos;
    }

    @XmlElement(namespace="http://www.sat.gob.mx/nomina12")
    public SubsidioAlEmpleo getSubsidioAlEmpleo() {
        return subsidioAlEmpleo;
    }

    public void setSubsidioAlEmpleo(SubsidioAlEmpleo subsidioAlEmpleo) {
        this.subsidioAlEmpleo = subsidioAlEmpleo;
    }

    @XmlElement(namespace="http://www.sat.gob.mx/nomina12")
    public CompensacionSaldosAFavor getCompensacionSaldosAFavor() {
        return compensacionSaldosAFavor;
    }

    public void setCompensacionSaldosAFavor(CompensacionSaldosAFavor compensacionSaldosAFavor) {
        this.compensacionSaldosAFavor = compensacionSaldosAFavor;
    }


}
