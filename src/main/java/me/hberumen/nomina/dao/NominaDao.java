package me.hberumen.nomina.dao;

import me.hberumen.nomina.modelo.Nomina;

import java.math.BigInteger;

/**
 * Created by hberumen on 01/12/16.
 */
public class NominaDao extends  Nomina{

    private BigInteger idComprobante;
    private BigInteger idNomina;

    public NominaDao(BigInteger idComprobante) {
    }

    public NominaDao getNominaFromIdComprobante(){
        return new NominaDao(idComprobante);
    }

    public BigInteger getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(BigInteger idComprobante) {
        this.idComprobante = idComprobante;
    }

    public BigInteger getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(BigInteger idNomina) {
        this.idNomina = idNomina;
    }
}
