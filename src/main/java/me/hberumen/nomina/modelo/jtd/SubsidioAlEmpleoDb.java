package me.hberumen.nomina.modelo.jtd;

import me.hberumen.nomina.modelo.SubsidioAlEmpleo;

import java.math.BigInteger;

/**
 * Created by hberumen on 23/01/17.
 */
public class SubsidioAlEmpleoDb extends SubsidioAlEmpleo {

    private BigInteger idSubsidio;
    private BigInteger idNomina;

    public SubsidioAlEmpleoDb() {
    }

    public BigInteger getIdSubsidio() {
        return idSubsidio;
    }

    public void setIdSubsidio(BigInteger idSubsidio) {
        this.idSubsidio = idSubsidio;
    }

    public BigInteger getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(BigInteger idNomina) {
        this.idNomina = idNomina;
    }
}
