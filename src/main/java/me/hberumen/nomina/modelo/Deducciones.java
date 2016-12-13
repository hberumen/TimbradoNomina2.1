package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/**
 * Created by hberumen on 30/11/16.
 */
@XmlRootElement(name="Deducciones")
public class Deducciones {

    private BigInteger idDeducciones;
    private BigInteger idNomina;
    private BigDecimal totalOtrasDeducciones;
    private BigDecimal totalImpuestosRetenidos;
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
        return totalImpuestosRetenidos;
    }

    public void setTotalImpuestosRetenidos(BigDecimal totalImpuestosRetenidos) {
        totalImpuestosRetenidos = totalImpuestosRetenidos;
    }


    public List<Deduccion> getDeduccion() {
        return deduccion;
    }

    public void setDeduccion(List<Deduccion> deduccion) {
        this.deduccion = deduccion;
    }

    public BigInteger getIdDeducciones() {
        return idDeducciones;
    }

    public void setIdDeducciones(BigInteger idDeducciones) {
        this.idDeducciones = idDeducciones;
    }

    public BigInteger getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(BigInteger idNomina) {
        this.idNomina = idNomina;
    }
}
