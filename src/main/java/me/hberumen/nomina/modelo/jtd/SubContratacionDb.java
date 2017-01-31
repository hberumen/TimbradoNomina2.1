package me.hberumen.nomina.modelo.jtd;

import me.hberumen.nomina.modelo.SubContratacion;

import java.math.BigInteger;

/**
 * Created by hberumen on 23/01/17.
 */
public class SubContratacionDb extends SubContratacion {

    private BigInteger idSubcontratacion;
    private BigInteger idReceptor;

    public SubContratacionDb() {
    }

    public BigInteger getIdSubcontratacion() {
        return idSubcontratacion;
    }

    public void setIdSubcontratacion(BigInteger idSubcontratacion) {
        this.idSubcontratacion = idSubcontratacion;
    }


    public BigInteger getIdReceptor() {
        return idReceptor;
    }

    public void setIdReceptor(BigInteger idReceptor) {
        this.idReceptor = idReceptor;
    }
}
