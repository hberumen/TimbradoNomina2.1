package me.hberumen.nomina.modelo.jtd;

import me.hberumen.nomina.modelo.Nomina;

import java.math.BigInteger;

/**
 * Created by hberumen on 17/01/17.
 */
public class NominaDb extends Nomina {

    private BigInteger idComprobante;
    private BigInteger idNomina;

    public NominaDb() {
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
