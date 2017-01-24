package me.hberumen.nomina.modelo.jtd;

import me.hberumen.nomina.modelo.CompensacionSaldosAFavor;

import java.math.BigInteger;

/**
 * Created by hberumen on 23/01/17.
 */
public class CompensacionSaldosAFavorDb extends CompensacionSaldosAFavor {

    private BigInteger idCompensacion;
    private BigInteger idNomina;

    public CompensacionSaldosAFavorDb() {
    }

    public BigInteger getIdCompensacion() {
        return idCompensacion;
    }

    public void setIdCompensacion(BigInteger idCompensacion) {
        this.idCompensacion = idCompensacion;
    }

    public BigInteger getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(BigInteger idNomina) {
        this.idNomina = idNomina;
    }
}
