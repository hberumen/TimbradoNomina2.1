package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by hberumen on 30/11/16.
 */
@XmlRootElement(name="Deducciones")
public class Deducciones {

    private BigDecimal totalOtrasDeducciones;
    private BigDecimal TotalImpuestosRetenidos;
    private List<Deduccion> deduccion;

    public Deducciones() {
    }

    @XmlAttribute
    public BigDecimal getTotalOtrasDeducciones() {
        return totalOtrasDeducciones;
    }

    public void setTotalOtrasDeducciones(BigDecimal totalOtrasDeducciones) {
        this.totalOtrasDeducciones = totalOtrasDeducciones;
    }

    @XmlAttribute
    public BigDecimal getTotalImpuestosRetenidos() {
        return TotalImpuestosRetenidos;
    }

    public void setTotalImpuestosRetenidos(BigDecimal totalImpuestosRetenidos) {
        TotalImpuestosRetenidos = totalImpuestosRetenidos;
    }


    public List<Deduccion> getDeduccion() {
        return deduccion;
    }

    public void setDeduccion(List<Deduccion> deduccion) {
        this.deduccion = deduccion;
    }
}
