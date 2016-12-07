package me.hberumen.nomina.dao;

import me.hberumen.nomina.modelo.SubContratacion;

import java.math.BigInteger;

/**
 * Created by hberumen on 01/12/16.
 */
public class SubContratacionDao {

    private BigInteger idNomina;

    public SubContratacionDao(BigInteger idNomina) {
        this.idNomina = idNomina;
    }

    public SubContratacion seleccionarSubContratacionPorIdNomina(){
        return  new SubContratacion();
    }
}
