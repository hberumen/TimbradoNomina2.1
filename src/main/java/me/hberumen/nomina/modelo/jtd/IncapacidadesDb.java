package me.hberumen.nomina.modelo.jtd;

import me.hberumen.nomina.modelo.Incapacidades;

import java.math.BigInteger;

/**
 * Created by hberumen on 23/01/17.
 */
public class IncapacidadesDb extends Incapacidades{

    private BigInteger idIncapacidad;
    private BigInteger idNomina;

    public IncapacidadesDb() {
    }

    public BigInteger getIdIncapacidad() {
        return idIncapacidad;
    }

    public void setIdIncapacidad(BigInteger idIncapacidad) {
        this.idIncapacidad = idIncapacidad;
    }

    public BigInteger getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(BigInteger idNomina) {
        this.idNomina = idNomina;
    }
}
