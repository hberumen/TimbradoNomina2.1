package me.hberumen.nomina.modelo.jtd;

import me.hberumen.nomina.modelo.Receptor;

import java.math.BigInteger;

/**
 * Created by hberumen on 17/01/17.
 */
public class ReceptorDb extends Receptor {

    private BigInteger idReceptor;
    private BigInteger idComprobante;

    public ReceptorDb() {
    }

    public BigInteger getIdReceptor() {
        return idReceptor;
    }

    public void setIdReceptor(BigInteger idReceptor) {
        this.idReceptor = idReceptor;
    }

    public BigInteger getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(BigInteger idComprobante) {
        this.idComprobante = idComprobante;
    }
}
