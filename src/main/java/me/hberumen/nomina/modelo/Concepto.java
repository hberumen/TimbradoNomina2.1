package me.hberumen.nomina.modelo;

import me.hberumen.nomina.util.Eutil;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

/**
 * Created by hberumen on 25/11/16.
 */
@XmlRootElement(name = "Concepto")
public class Concepto {


    private Integer cantidad;
    private String unidad;
    private String descripcion;
    private BigDecimal valorUnitario;
    private BigDecimal importe;

    public Concepto() {
    }

    @XmlAttribute(name = "cantidad")
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @XmlAttribute(name = "unidad")
    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @XmlAttribute(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlAttribute(name = "valorUnitario")
    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @XmlAttribute(name = "importe")
    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }


    public static Concepto builder(){
        Concepto concepto = new Concepto();
        concepto.setCantidad(1);
        concepto.setUnidad(Eutil.CONCEPTO_UNIDAD.getValor());
        concepto.setDescripcion(Eutil.CONCEPTO_DESCRIPCION.getValor());
        concepto.setValorUnitario(new BigDecimal("100.00"));
        concepto.setImporte(new BigDecimal("100.00"));

        return concepto;
    }

}
