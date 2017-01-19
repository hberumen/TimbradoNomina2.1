package me.hberumen.nomina.modelo.jtd;

import me.hberumen.nomina.modelo.Percepcion;

import java.math.BigInteger;

/**
 * Created by hberumen on 17/01/17.
 */
public class PercepcionDb extends Percepcion {

    private BigInteger idPercepcion;
    private BigInteger idPercepciones;

    public PercepcionDb() {
    }

    public BigInteger getIdPercepcion() {
        return idPercepcion;
    }

    public void setIdPercepcion(BigInteger idPercepcion) {
        this.idPercepcion = idPercepcion;
    }

    public BigInteger getIdPercepciones() {
        return idPercepciones;
    }

    public void setIdPercepciones(BigInteger idPercepciones) {
        this.idPercepciones = idPercepciones;
    }

}
