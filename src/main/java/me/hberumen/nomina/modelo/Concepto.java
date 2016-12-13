package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by hberumen on 25/11/16.
 */
@XmlRootElement(name = "Concepto")
public class Concepto {

    private  BigInteger idConcepto;
    private BigInteger idComprobante;
    private Integer cantidad;
    private String unidad;
    private String descripcion;
    private BigDecimal valorUnitario;
    private BigDecimal importe;

    public Concepto() {
    }

    @XmlAttribute
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @XmlAttribute
    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @XmlAttribute
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlAttribute
    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @XmlAttribute
    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public BigInteger getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(BigInteger idComprobante) {
        this.idComprobante = idComprobante;
    }

    public BigInteger getIdConcepto() {
        return idConcepto;
    }

    public void setIdConcepto(BigInteger idConcepto) {
        this.idConcepto = idConcepto;
    }
}
