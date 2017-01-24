package me.hberumen.nomina.modelo.jtd;

import me.hberumen.nomina.modelo.JubilacionPensionRetiro;

import java.math.BigInteger;

/**
 * Created by hberumen on 23/01/17.
 */
public class JubilacionPensionRetiroDb extends JubilacionPensionRetiro {

    private BigInteger idJubilacion;
    private BigInteger idNomina;

    public JubilacionPensionRetiroDb() {
    }

    public BigInteger getIdJubilacion() {
        return idJubilacion;
    }

    public void setIdJubilacion(BigInteger idJubilacion) {
        this.idJubilacion = idJubilacion;
    }

    public BigInteger getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(BigInteger idNomina) {
        this.idNomina = idNomina;
    }


}
