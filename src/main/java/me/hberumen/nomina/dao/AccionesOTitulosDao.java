package me.hberumen.nomina.dao;

import me.hberumen.nomina.modelo.AccionesOTitulos;

import java.math.BigInteger;

/**
 * Created by hberumen on 01/12/16.
 */
public class AccionesOTitulosDao extends AccionesOTitulos{

    private BigInteger idNomina;

    public AccionesOTitulosDao(BigInteger idNomina) {
        this.idNomina = idNomina;
    }

    public AccionesOTitulos selecionarAccionesOTitulosPorIdNomina(){
        return null;
    }
}
