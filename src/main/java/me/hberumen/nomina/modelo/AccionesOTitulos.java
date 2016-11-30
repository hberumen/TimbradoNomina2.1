package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

/**
 * Created by hberumen on 30/11/16.
 */
@XmlRootElement(name="AccionesOTitulos")
public class AccionesOTitulos {

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
}
