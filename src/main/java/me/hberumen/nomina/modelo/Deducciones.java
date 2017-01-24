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
@XmlRootElement(name="Deducciones")
public class Deducciones {


    private BigDecimal totalOtrasDeducciones;
    private BigDecimal totalImpuestosRetenidos;
    private List<Deduccion> deduccion;

    public Deducciones() {
    }

    @XmlAttribute(name = "TotalOtrasDeducciones")
    public BigDecimal getTotalOtrasDeducciones() {
        return totalOtrasDeducciones;
    }

    public void setTotalOtrasDeducciones(BigDecimal totalOtrasDeducciones) {
        this.totalOtrasDeducciones = totalOtrasDeducciones;
    }

    @XmlElement(name = "Deduccion", namespace="http://www.sat.gob.mx/nomina12")
    public List<Deduccion> getDeduccion() {
        return deduccion;
    }

    public void setDeduccion(List<Deduccion> deduccion) {
        this.deduccion = deduccion;
    }

    @XmlAttribute(name = "TotalImpuestosRetenidos")
    public BigDecimal getTotalImpuestosRetenidos() {
        return totalImpuestosRetenidos;
    }

    public void setTotalImpuestosRetenidos(BigDecimal totalImpuestosRetenidos) {
        this.totalImpuestosRetenidos = totalImpuestosRetenidos;
    }
}
