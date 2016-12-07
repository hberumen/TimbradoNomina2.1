package me.hberumen.nomina.dao;

import me.hberumen.nomina.modelo.Percepciones;

import java.math.BigInteger;

/**
 * Created by hberumen on 01/12/16.
 */
public class PercepcionesDao extends Percepciones{

    private BigInteger idNomina;
    private BigInteger idPercepciones;

    public PercepcionesDao(BigInteger idNomina) {
        this.idNomina = idNomina;
    }

    public PercepcionesDao seleccionarPercepcionesPorIdNomina(){
        return new PercepcionesDao(idNomina);
    }

    public BigInteger getIdPercepciones() {
        return idPercepciones;
    }

    public void setIdPercepciones(BigInteger idPercepciones) {
        this.idPercepciones = idPercepciones;
    }
}
