package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by hberumen on 30/11/16.
 */
@XmlRootElement(name="SeparacionIndemnizacion")
public class SeparacionIndemnizacion {

    private BigInteger idSeparacion;
    private BigInteger idNomina;
    private BigDecimal totalPagado;
    private Integer numAnosServicios;
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
    public Integer getNumAnosServicios() {
        return numAnosServicios;
    }

    public void setNumAnosServicios(Integer numAnosServicios) {
        this.numAnosServicios = numAnosServicios;
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

    public BigInteger getIdSeparacion() {
        return idSeparacion;
    }

    public void setIdSeparacion(BigInteger idSeparacion) {
        this.idSeparacion = idSeparacion;
    }

    public BigInteger getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(BigInteger idNomina) {
        this.idNomina = idNomina;
    }
}
