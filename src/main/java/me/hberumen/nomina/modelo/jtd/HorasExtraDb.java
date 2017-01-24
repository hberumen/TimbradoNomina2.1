package me.hberumen.nomina.modelo.jtd;

import me.hberumen.nomina.modelo.HorasExtra;

import java.math.BigInteger;

/**
 * Created by hberumen on 23/01/17.
 */
public class HorasExtraDb extends HorasExtra{

    private BigInteger idHorasExtra;
    private BigInteger idNomina;

    public HorasExtraDb() {
    }

    public BigInteger getIdHorasExtra() {
        return idHorasExtra;
    }

    public void setIdHorasExtra(BigInteger idHorasExtra) {
        this.idHorasExtra = idHorasExtra;
    }

    public BigInteger getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(BigInteger idNomina) {
        this.idNomina = idNomina;
    }
}
