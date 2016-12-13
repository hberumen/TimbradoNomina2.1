package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by hberumen on 30/11/16.
 */
@XmlRootElement(name="AccionesOTitulos")
public class AccionesOTitulos {

    private BigInteger idAcciones;
    private BigInteger idNomina;
    private BigDecimal valorMercado;
    private BigDecimal precioAlOtorgarse;

    public AccionesOTitulos() {
    }

    @XmlAttribute
    public BigDecimal getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(BigDecimal valorMercado) {
        this.valorMercado = valorMercado;
    }

    @XmlAttribute
    public BigDecimal getPrecioAlOtorgarse() {
        return precioAlOtorgarse;
    }

    public void setPrecioAlOtorgarse(BigDecimal precioAlOtorgarse) {
        this.precioAlOtorgarse = precioAlOtorgarse;
    }

    public BigInteger getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(BigInteger idNomina) {
        this.idNomina = idNomina;
    }

    public BigInteger getIdAcciones() {
        return idAcciones;
    }

    public void setIdAcciones(BigInteger idAcciones) {
        this.idAcciones = idAcciones;
    }
}
