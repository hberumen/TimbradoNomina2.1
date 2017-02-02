package me.hberumen.nomina.modelo.jtd;

import me.hberumen.nomina.modelo.OtroPago;

import java.math.BigInteger;

/**
 * Created by hberumen on 23/01/17.
 */
public class OtroPagoDb extends OtroPago {

    private BigInteger idOtroPago;
    private BigInteger idNomina;

    public OtroPagoDb() {
    }

    public BigInteger getIdOtroPago() {
        return idOtroPago;
    }

    public void setIdOtroPago(BigInteger idOtroPago) {
        this.idOtroPago = idOtroPago;
    }

    public BigInteger getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(BigInteger idNomina) {
        this.idNomina = idNomina;
    }
}
