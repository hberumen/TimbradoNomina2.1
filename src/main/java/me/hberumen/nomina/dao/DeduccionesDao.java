package me.hberumen.nomina.dao;

import me.hberumen.nomina.modelo.Deducciones;

import java.math.BigInteger;

/**
 * Created by hberumen on 01/12/16.
 */
public class DeduccionesDao extends Deducciones{

    private BigInteger idNomina;
    private BigInteger idDeducciones;

    public DeduccionesDao(BigInteger idNomina) {
        this.idNomina = idNomina;
    }

    public DeduccionesDao seleccionarDeduccionesPorIdNomina(){
        return new DeduccionesDao(idNomina);
    }

    public BigInteger getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(BigInteger idNomina) {
        this.idNomina = idNomina;
    }

    public BigInteger getIdDeducciones() {
        return idDeducciones;
    }

    public void setIdDeducciones(BigInteger idDeducciones) {
        this.idDeducciones = idDeducciones;
    }
}
