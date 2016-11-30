package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by hberumen on 25/11/16.
 */
@XmlRootElement(namespace="http://www.sat.gob.mx/nomina", name="Nomina")
public class Nomina {

    public static final String SCHEMA_NOMINA = "http://www.sat.gob.mx/nomina http://www.sat.gob.mx/sitio_internet/cfd/nomina/nomina12.xsd";

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-mm-dd");

    private String version;
    private String tipoNomina;
    private Date fechaPago;
    private Date fechaInicialPago;
    private Date fechaFinalPago;
    private double numDiasPagados;
    private BigDecimal totalPercepciones;
    private BigDecimal totalDeducciones;
    private BigDecimal totalOtrosPagos;

    private Emisor emisor;
    private EntidadSNFC entidadSNFC;
    private Receptor receptor;
    private SubContratacion subContratacion;

    public Nomina() {
        emisor = new Emisor();
        entidadSNFC = new EntidadSNFC();
        receptor = new Receptor();
        subContratacion = new SubContratacion();
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

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Date getFechaInicialPago() {
        return fechaInicialPago;
    }

    public void setFechaInicialPago(Date fechaInicialPago) {
        this.fechaInicialPago = fechaInicialPago;
    }

    public Date getFechaFinalPago() {
        return fechaFinalPago;
    }

    public void setFechaFinalPago(Date fechaFinalPago) {
        this.fechaFinalPago = fechaFinalPago;
    }

    public double getNumDiasPagados() {
        return numDiasPagados;
    }

    public void setNumDiasPagados(double numDiasPagados) {
        this.numDiasPagados = numDiasPagados;
    }

    public BigDecimal getTotalPercepciones() {
        return totalPercepciones;
    }

    public void setTotalPercepciones(BigDecimal totalPercepciones) {
        this.totalPercepciones = totalPercepciones;
    }

    public BigDecimal getTotalDeducciones() {
        return totalDeducciones;
    }

    public void setTotalDeducciones(BigDecimal totalDeducciones) {
        this.totalDeducciones = totalDeducciones;
    }

    public BigDecimal getTotalOtrosPagos() {
        return totalOtrosPagos;
    }

    public void setTotalOtrosPagos(BigDecimal totalOtrosPagos) {
        this.totalOtrosPagos = totalOtrosPagos;
    }

    public Emisor getEmisor() {
        return emisor;
    }

    public void setEmisor(Emisor emisor) {
        this.emisor = emisor;
    }

    public EntidadSNFC getEntidadSNFC() {
        return entidadSNFC;
    }

    public void setEntidadSNFC(EntidadSNFC entidadSNFC) {
        this.entidadSNFC = entidadSNFC;
    }

    public Receptor getReceptor() {
        return receptor;
    }

    public void setReceptor(Receptor receptor) {
        this.receptor = receptor;
    }
}
