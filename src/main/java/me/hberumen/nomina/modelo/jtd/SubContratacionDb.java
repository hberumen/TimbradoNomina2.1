package me.hberumen.nomina.modelo.jtd;

import me.hberumen.nomina.modelo.SubContratacion;

import java.math.BigInteger;

/**
 * Created by hberumen on 23/01/17.
 */
public class SubContratacionDb extends SubContratacion {

    private BigInteger idSubcontratacion;
    private BigInteger idNomina;

    public SubContratacionDb() {
    }

    public BigInteger getIdSubcontratacion() {
        return idSubcontratacion;
    }

    public void setIdSubcontratacion(BigInteger idSubcontratacion) {
        this.idSubcontratacion = idSubcontratacion;
    }

    public BigInteger getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(BigInteger idNomina) {
        this.idNomina = idNomina;
    }

}
