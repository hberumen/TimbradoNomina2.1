package me.hberumen.nomina.dao;

import me.hberumen.nomina.modelo.Receptor;

import java.math.BigInteger;

/**
 * Created by hberumen on 01/12/16.
 */
public class ReceptorDao extends Receptor {

    private BigInteger idComprobante;

    public ReceptorDao(BigInteger idComprobante) {
        this.idComprobante = idComprobante;
    }

    public Receptor getReceptorPorIdComprobante(){
        return new Receptor();
    }

    public BigInteger getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(BigInteger idComprobante) {
        this.idComprobante = idComprobante;
    }
}
