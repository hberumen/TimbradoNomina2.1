package me.hberumen.nomina.dao;

import me.hberumen.nomina.modelo.Percepcion;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hberumen on 01/12/16.
 */
public class PercepcionDao extends Percepcion{

    private BigInteger idPercepciones;

    public PercepcionDao(BigInteger idPercepciones) {
        this.idPercepciones = idPercepciones;
    }

    public List<Percepcion> seleccionarPercepcionPorIdPercepciones(){
        return new ArrayList<Percepcion>();
    }
}
