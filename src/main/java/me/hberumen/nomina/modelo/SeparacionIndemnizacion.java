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
    private int numAñosServicios;
    private BigDecimal ultimoSueldoMensOrd;
    private BigDecimal ingresoAcomulado;
    private BigDecimal ingresoNoAcomulado;

    public SeparacionIndemnizacion() {
    }

    @XmlAttribute
    public BigDecimal getTotalPagado() {
        return totalPagado;
    }

    public void setTotalPagado(BigDecimal totalPagado) {
        this.totalPagado = totalPagado;
    }

    @XmlAttribute
    public int getNumAñosServicios() {
        return numAñosServicios;
    }

    public void setNumAñosServicios(int numAñosServicios) {
        this.numAñosServicios = numAñosServicios;
    }

    @XmlAttribute
    public BigDecimal getUltimoSueldoMensOrd() {
        return ultimoSueldoMensOrd;
    }

    public void setUltimoSueldoMensOrd(BigDecimal ultimoSueldoMensOrd) {
        this.ultimoSueldoMensOrd = ultimoSueldoMensOrd;
    }

    @XmlAttribute
    public BigDecimal getIngresoAcomulado() {
        return ingresoAcomulado;
    }

    public void setIngresoAcomulado(BigDecimal ingresoAcomulado) {
        this.ingresoAcomulado = ingresoAcomulado;
    }

    @XmlAttribute
    public BigDecimal getIngresoNoAcomulado() {
        return ingresoNoAcomulado;
    }

    public void setIngresoNoAcomulado(BigDecimal ingresoNoAcomulado) {
        this.ingresoNoAcomulado = ingresoNoAcomulado;
    }
}
