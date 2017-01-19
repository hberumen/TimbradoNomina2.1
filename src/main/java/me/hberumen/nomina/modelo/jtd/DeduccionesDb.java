package me.hberumen.nomina.modelo.jtd;

import me.hberumen.nomina.modelo.Deducciones;

import java.math.BigInteger;

/**
 * Created by hberumen on 17/01/17.
 */
public class DeduccionesDb extends Deducciones {

    private BigInteger idDeducciones;
    private BigInteger idNomina;

    public DeduccionesDb() {
    }

    public BigInteger getIdDeducciones() {
        return idDeducciones;
    }

    public void setIdDeducciones(BigInteger idDeducciones) {
        this.idDeducciones = idDeducciones;
    }

    public BigInteger getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(BigInteger idNomina) {
        this.idNomina = idNomina;
    }
}
