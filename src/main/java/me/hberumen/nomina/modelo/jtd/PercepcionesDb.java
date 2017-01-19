package me.hberumen.nomina.modelo.jtd;

import me.hberumen.nomina.modelo.Percepciones;

import java.math.BigInteger;

/**
 * Created by hberumen on 17/01/17.
 */
public class PercepcionesDb extends Percepciones {

    private BigInteger idPercepciones;
    private BigInteger idNomina;

    public PercepcionesDb() {

    }

    public BigInteger getIdPercepciones() {
        return idPercepciones;
    }

    public void setIdPercepciones(BigInteger idPercepciones) {
        this.idPercepciones = idPercepciones;
    }

    public BigInteger getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(BigInteger idNomina) {
        this.idNomina = idNomina;
    }
}
