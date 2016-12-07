package me.hberumen.nomina.dao;

import me.hberumen.nomina.modelo.SeparacionIndemnizacion;

import java.math.BigInteger;

/**
 * Created by hberumen on 01/12/16.
 */
public class SeparacionIndemnizacionDao extends SeparacionIndemnizacion{

    private BigInteger idNomina;

    public SeparacionIndemnizacionDao(BigInteger idNomina) {
        this.idNomina = idNomina;
    }

    public SeparacionIndemnizacion seleccionarSeparacionIndemnizacionPorIdNomina(){
        return null;
    }
}
