package me.hberumen.nomina.modelo.jtd;

import me.hberumen.nomina.modelo.SeparacionIndemnizacion;

import java.math.BigInteger;

/**
 * Created by hberumen on 23/01/17.
 */
public class SeparacionIndemnizacionDb extends SeparacionIndemnizacion {

    private BigInteger idSeparacion;
    private BigInteger idNomina;

    public SeparacionIndemnizacionDb() {
    }

    public BigInteger getIdSeparacion() {
        return idSeparacion;
    }

    public void setIdSeparacion(BigInteger idSeparacion) {
        this.idSeparacion = idSeparacion;
    }

    public BigInteger getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(BigInteger idNomina) {
        this.idNomina = idNomina;
    }
}
