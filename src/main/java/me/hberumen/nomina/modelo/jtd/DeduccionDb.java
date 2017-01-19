package me.hberumen.nomina.modelo.jtd;

import me.hberumen.nomina.modelo.Deduccion;

import java.math.BigInteger;

/**
 * Created by hberumen on 17/01/17.
 */
public class DeduccionDb extends Deduccion {

    private BigInteger idDeduccion;
    private BigInteger idDeducciones;

    public DeduccionDb() {
    }

    public BigInteger getIdDeduccion() {
        return idDeduccion;
    }

    public void setIdDeduccion(BigInteger idDeduccion) {
        this.idDeduccion = idDeduccion;
    }

    public BigInteger getIdDeducciones() {
        return idDeducciones;
    }

    public void setIdDeducciones(BigInteger idDeducciones) {
        this.idDeducciones = idDeducciones;
    }

}
