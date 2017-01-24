package me.hberumen.nomina.modelo.jtd;

import java.math.BigInteger;

/**
 * Created by hberumen on 23/01/17.
 */
public class AccionesOTitulosDb {

    private BigInteger idAcciones;
    private BigInteger idNomina;

    public AccionesOTitulosDb() {
    }

    public BigInteger getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(BigInteger idNomina) {
        this.idNomina = idNomina;
    }

    public BigInteger getIdAcciones() {
        return idAcciones;
    }

    public void setIdAcciones(BigInteger idAcciones) {
        this.idAcciones = idAcciones;
    }
}
