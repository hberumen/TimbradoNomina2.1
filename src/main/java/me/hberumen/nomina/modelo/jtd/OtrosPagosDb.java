package me.hberumen.nomina.modelo.jtd;

import me.hberumen.nomina.modelo.OtrosPagos;

import java.math.BigInteger;

/**
 * Created by hberumen on 23/01/17.
 */
public class OtrosPagosDb extends OtrosPagos {

    private BigInteger idOtrosPagos;
    private BigInteger idNomina;

    public OtrosPagosDb() {
    }

    public BigInteger getIdOtrosPagos() {
        return idOtrosPagos;
    }

    public void setIdOtrosPagos(BigInteger idOtrosPagos) {
        this.idOtrosPagos = idOtrosPagos;
    }

    public BigInteger getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(BigInteger idNomina) {
        this.idNomina = idNomina;
    }
}
