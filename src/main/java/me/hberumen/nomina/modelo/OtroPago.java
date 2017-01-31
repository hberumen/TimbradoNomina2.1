package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

/**
 * Created by hberumen on 30/11/16.
 */
@XmlRootElement(name="OtroPago")
public class OtroPago {

    private String tipoOtroPago;
    private String clave;
    private String concepto;
    private BigDecimal importe;

    public OtroPago() {
    }

    @XmlAttribute(name = "TipoOtroPago")
    public String getTipoOtroPago() {
        return tipoOtroPago;
    }

    public void setTipoOtroPago(String tipoOtroPago) {
        this.tipoOtroPago = tipoOtroPago;
    }

    @XmlAttribute(name = "Clave")
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @XmlAttribute(name = "Concepto")
    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    @XmlAttribute(name = "Importe")
    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

}
