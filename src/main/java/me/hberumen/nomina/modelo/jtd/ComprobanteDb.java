package me.hberumen.nomina.modelo.jtd;

import me.hberumen.nomina.modelo.Comprobante;

import java.math.BigInteger;

/**
 * Created by hberumen on 17/01/17.
 */
public class ComprobanteDb extends Comprobante {

    private BigInteger idComprobante;
    private BigInteger agrupa;

    public ComprobanteDb() {
    }

    public BigInteger getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(BigInteger idComprobante) {
        this.idComprobante = idComprobante;
    }

    public BigInteger getAgrupa() {
        return agrupa;
    }

    public void setAgrupa(BigInteger agrupa) {
        this.agrupa = agrupa;
    }
}
