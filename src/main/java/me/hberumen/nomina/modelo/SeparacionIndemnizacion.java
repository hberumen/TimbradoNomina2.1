package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

/**
 * Created by hberumen on 30/11/16.
 */
@XmlRootElement(name="SeparacionIndemnizacion")
public class SeparacionIndemnizacion {


    private BigDecimal totalPagado;
    private Integer numAnosServicio;
    private BigDecimal ultimoSueldoMensOrd;
    private BigDecimal ingresoAcumulable;
    private BigDecimal ingresoNoAcumulable;

    public SeparacionIndemnizacion() {
    }

    @XmlAttribute(name = "TotalPagado")
    public BigDecimal getTotalPagado() {
        return totalPagado;
    }

    public void setTotalPagado(BigDecimal totalPagado) {
        this.totalPagado = totalPagado;
    }

    @XmlAttribute(name = "NumAñosServicio")
    public Integer getNumAnosServicio() {
        return numAnosServicio;
    }

    public void setNumAnosServicio(Integer numAnosServicios) {
        this.numAnosServicio = numAnosServicios;
    }

    @XmlAttribute(name = "UltimoSueldoMensOrd")
    public BigDecimal getUltimoSueldoMensOrd() {
        return ultimoSueldoMensOrd;
    }

    public void setUltimoSueldoMensOrd(BigDecimal ultimoSueldoMensOrd) {
        this.ultimoSueldoMensOrd = ultimoSueldoMensOrd;
    }

    @XmlAttribute(name = "IngresoAcomulable")
    public BigDecimal getIngresoAcumulable() {
        return ingresoAcumulable;
    }

    public void setIngresoAcumulable(BigDecimal ingresoAcomulado) {
        this.ingresoAcumulable = ingresoAcomulado;
    }

    @XmlAttribute(name = "IngresoNoAcomulable")
    public BigDecimal getIngresoNoAcumulable() {
        return ingresoNoAcumulable;
    }

    public void setIngresoNoAcumulable(BigDecimal ingresoNoAcomulado) {
        this.ingresoNoAcumulable = ingresoNoAcomulado;
    }


}
