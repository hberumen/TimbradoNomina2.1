package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/**
 * Created by hberumen on 30/11/16.
 */
@XmlRootElement(name="Percepciones")
public class Percepciones {


    private BigDecimal totalSueldos;
    private BigDecimal totalSeparacionIndemnizacion;
    private BigDecimal totalJubilacionPensionRetiro;
    private BigDecimal totalGravado;
    private BigDecimal totalExento;

    private List<Percepcion> percepcion;

    public Percepciones() {
    }

    @XmlAttribute
    public BigDecimal getTotalSueldos() {
        return totalSueldos;
    }

    public void setTotalSueldos(BigDecimal totalSueldos) {
        this.totalSueldos = totalSueldos;
    }

    @XmlAttribute
    public BigDecimal getTotalSeparacionIndemnizacion() {
        return totalSeparacionIndemnizacion;
    }

    public void setTotalSeparacionIndemnizacion(BigDecimal totalSeparacionIndemnizacion) {
        this.totalSeparacionIndemnizacion = totalSeparacionIndemnizacion;
    }

    @XmlAttribute
    public BigDecimal getTotalJubilacionPensionRetiro() {
        return totalJubilacionPensionRetiro;
    }

    public void setTotalJubilacionPensionRetiro(BigDecimal totalJubilacionPensionRetiro) {
        this.totalJubilacionPensionRetiro = totalJubilacionPensionRetiro;
    }

    @XmlAttribute
    public BigDecimal getTotalGravado() {
        return totalGravado;
    }

    public void setTotalGravado(BigDecimal totalGravado) {
        this.totalGravado = totalGravado;
    }

    @XmlAttribute
    public BigDecimal getTotalExento() {
        return totalExento;
    }

    public void setTotalExento(BigDecimal totalExento) {
        this.totalExento = totalExento;
    }

    @XmlElement(namespace="http://www.sat.gob.mx/nomina12")
    public List<Percepcion> getPercepcion() {
        return percepcion;
    }

    public void setPercepcion(List<Percepcion> percepcion) {
        this.percepcion = percepcion;
    }


}
