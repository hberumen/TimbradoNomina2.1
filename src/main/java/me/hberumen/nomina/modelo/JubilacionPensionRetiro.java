package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

/**
 * Created by hberumen on 30/11/16.
 */
@XmlRootElement(name="JubilacionPensionRetiro")
public class JubilacionPensionRetiro {

    private BigDecimal totalUnaExhibicion;
    private BigDecimal totalParcialidad;
    private BigDecimal montoDiario;
    private BigDecimal ingresoAcumulable;
    private BigDecimal ingresoNoAcomulable;

    public JubilacionPensionRetiro() {
    }

    @XmlAttribute
    public BigDecimal getTotalUnaExhibicion() {
        return totalUnaExhibicion;
    }

    public void setTotalUnaExhibicion(BigDecimal totalUnaExhibicion) {
        this.totalUnaExhibicion = totalUnaExhibicion;
    }

    @XmlAttribute
    public BigDecimal getTotalParcialidad() {
        return totalParcialidad;
    }

    public void setTotalParcialidad(BigDecimal totalParcialidad) {
        this.totalParcialidad = totalParcialidad;
    }

    @XmlAttribute
    public BigDecimal getMontoDiario() {
        return montoDiario;
    }

    public void setMontoDiario(BigDecimal montoDiario) {
        this.montoDiario = montoDiario;
    }

    @XmlAttribute
    public BigDecimal getIngresoAcumulable() {
        return ingresoAcumulable;
    }

    public void setIngresoAcumulable(BigDecimal ingresoAcumulable) {
        this.ingresoAcumulable = ingresoAcumulable;
    }

    @XmlAttribute
    public BigDecimal getIngresoNoAcomulable() {
        return ingresoNoAcomulable;
    }

    public void setIngresoNoAcomulable(BigDecimal ingresoNoAcomulable) {
        this.ingresoNoAcomulable = ingresoNoAcomulable;
    }
}
