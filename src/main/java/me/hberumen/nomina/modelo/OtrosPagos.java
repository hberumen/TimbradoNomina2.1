package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by hberumen on 30/11/16.
 */
@XmlRootElement(name="OtrosPagos")
public class OtrosPagos {

    private OtroPago otroPago;

    public OtrosPagos() {
        otroPago = new OtroPago();
    }

    public OtroPago getOtroPago() {
        return otroPago;
    }

    public void setOtroPago(OtroPago otroPago) {
        this.otroPago = otroPago;
    }
}
