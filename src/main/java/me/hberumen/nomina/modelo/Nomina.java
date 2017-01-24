package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by hberumen on 25/11/16.
 */
@XmlRootElement(namespace="http://www.sat.gob.mx/nomina12", name="Nomina")
@XmlType(propOrder = {"emisor", "receptor", "percepciones", "deducciones", "accionesOTitulos","horasExtra","jubilacionPensionRetiro","separacionIndemnizacion","incapacidades","otrosPagos","subsidioAlEmpleo","compensacionSaldosAFavor"})
public class Nomina {

    public static final String SCHEMA_NOMINA = "http://www.sat.gob.mx/nomina12 http://www.sat.gob.mx/sitio_internet/cfd/nomina/nomina12.xsd";


    private String version;
    private String tipoNomina;
    private String fechaPago;
    private String fechaInicialPago;
    private String fechaFinalPago;
    private Double numDiasPagados;
    private BigDecimal totalPercepciones;
    private BigDecimal totalDeducciones;
    private BigDecimal totalOtrosPagos;

    private Emisor emisor;
    private Receptor receptor;
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

    @XmlAttribute(name="Version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @XmlAttribute(name = "TipoNomina")
    public String getTipoNomina() {
        return tipoNomina;
    }

    public void setTipoNomina(String tipoNomina) {
        this.tipoNomina = tipoNomina;
    }

    @XmlAttribute(name = "FechaPago")
    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    @XmlAttribute(name = "FechaInicialPago")
    public String getFechaInicialPago() {
        return fechaInicialPago;
    }

    public void setFechaInicialPago(String fechaInicialPago) {
        this.fechaInicialPago = fechaInicialPago;
    }

    @XmlAttribute(name = "FechaFinalPago")
    public String getFechaFinalPago() {
        return fechaFinalPago;
    }

    public void setFechaFinalPago(String fechaFinalPago) {
        this.fechaFinalPago = fechaFinalPago;
    }

    @XmlAttribute(name = "NumDiasPagados")
    public Double getNumDiasPagados() {
        return numDiasPagados;
    }

    public void setNumDiasPagados(Double numDiasPagados) {
        this.numDiasPagados = numDiasPagados;
    }

    @XmlAttribute(name = "TotalPercepciones")
    public BigDecimal getTotalPercepciones() {
        return totalPercepciones;
    }

    public void setTotalPercepciones(BigDecimal totalPercepciones) {
        this.totalPercepciones = totalPercepciones;
    }

    @XmlAttribute(name = "TotalDeducciones")
    public BigDecimal getTotalDeducciones() {
        return totalDeducciones;
    }

    public void setTotalDeducciones(BigDecimal totalDeducciones) {
        this.totalDeducciones = totalDeducciones;
    }

    @XmlAttribute(name = "TotalOtrosPagos")
    public BigDecimal getTotalOtrosPagos() {
        return totalOtrosPagos;
    }

    public void setTotalOtrosPagos(BigDecimal totalOtrosPagos) {
        this.totalOtrosPagos = totalOtrosPagos;
    }

    @XmlElement(name="Emisor", namespace="http://www.sat.gob.mx/nomina12")
    public Emisor getEmisor() {
        return emisor;
    }

    public void setEmisor(Emisor emisor) {
        this.emisor = emisor;
    }

    @XmlElement(name="Receptor", namespace="http://www.sat.gob.mx/nomina12")
    public Receptor getReceptor() {
        return receptor;
    }

    public void setReceptor(Receptor receptor) {
        this.receptor = receptor;
    }

    @XmlElement(name="Percepciones", namespace="http://www.sat.gob.mx/nomina12")
    public Percepciones getPercepciones() {
        return percepciones;
    }

    public void setPercepciones(Percepciones percepciones) {
        this.percepciones = percepciones;
    }

    @XmlElement(name="AccionesOTitulos", namespace="http://www.sat.gob.mx/nomina12")
    public AccionesOTitulos getAccionesOTitulos() {
        return accionesOTitulos;
    }

    public void setAccionesOTitulos(AccionesOTitulos accionesOTitulos) {
        this.accionesOTitulos = accionesOTitulos;
    }

    @XmlElement(name = "HorasExtra", namespace="http://www.sat.gob.mx/nomina12")
    public HorasExtra getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(HorasExtra horasExtra) {
        this.horasExtra = horasExtra;
    }

    @XmlElement(name = "JubilacionPensionRetiro", namespace="http://www.sat.gob.mx/nomina12")
    public JubilacionPensionRetiro getJubilacionPensionRetiro() {
        return jubilacionPensionRetiro;
    }

    public void setJubilacionPensionRetiro(JubilacionPensionRetiro jubilacionPensionRetiro) {
        this.jubilacionPensionRetiro = jubilacionPensionRetiro;
    }

    @XmlElement(name = "SeparacionIndemnizacion", namespace="http://www.sat.gob.mx/nomina12")
    public SeparacionIndemnizacion getSeparacionIndemnizacion() {
        return separacionIndemnizacion;
    }

    public void setSeparacionIndemnizacion(SeparacionIndemnizacion separacionIndemnizacion) {
        this.separacionIndemnizacion = separacionIndemnizacion;
    }

    @XmlElement(name = "Deducciones", namespace="http://www.sat.gob.mx/nomina12")
    public Deducciones getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(Deducciones deducciones) {
        this.deducciones = deducciones;
    }

    @XmlElement(name = "Incapacidades", namespace="http://www.sat.gob.mx/nomina12")
    public Incapacidades getIncapacidades() {
        return incapacidades;
    }

    public void setIncapacidades(Incapacidades incapacidades) {
        this.incapacidades = incapacidades;
    }

    @XmlElement(name = "OtrosPagos", namespace="http://www.sat.gob.mx/nomina12")
    public OtrosPagos getOtrosPagos() {
        return otrosPagos;
    }

    public void setOtrosPagos(OtrosPagos otrosPagos) {
        this.otrosPagos = otrosPagos;
    }

    @XmlElement(name = "SubsidioAlEmpleo", namespace="http://www.sat.gob.mx/nomina12")
    public SubsidioAlEmpleo getSubsidioAlEmpleo() {
        return subsidioAlEmpleo;
    }

    public void setSubsidioAlEmpleo(SubsidioAlEmpleo subsidioAlEmpleo) {
        this.subsidioAlEmpleo = subsidioAlEmpleo;
    }

    @XmlElement(name = "CompensacionSaldosAFavor", namespace="http://www.sat.gob.mx/nomina12")
    public CompensacionSaldosAFavor getCompensacionSaldosAFavor() {
        return compensacionSaldosAFavor;
    }

    public void setCompensacionSaldosAFavor(CompensacionSaldosAFavor compensacionSaldosAFavor) {
        this.compensacionSaldosAFavor = compensacionSaldosAFavor;
    }


}
