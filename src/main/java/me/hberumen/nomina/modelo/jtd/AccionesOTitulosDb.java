package me.hberumen.nomina.modelo.jtd;

import me.hberumen.nomina.modelo.AccionesOTitulos;

import java.math.BigInteger;

/**
 * Created by hberumen on 23/01/17.
 */
public class AccionesOTitulosDb  extends AccionesOTitulos{

    private BigInteger idAccionesotitulos;
    private BigInteger idNomina;

    public AccionesOTitulosDb() {
    }

    public BigInteger getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(BigInteger idNomina) {
        this.idNomina = idNomina;
    }


    public BigInteger getIdAccionesotitulos() {
        return idAccionesotitulos;
    }

    public void setIdAccionesotitulos(BigInteger idAccionesotitulos) {
        this.idAccionesotitulos = idAccionesotitulos;
    }
}
