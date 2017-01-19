package me.hberumen.nomina.modelo.jtd;

import me.hberumen.nomina.modelo.EntidadSNFC;

import java.math.BigInteger;

/**
 * Created by hberumen on 17/01/17.
 */
public class EntidadSNFCDb extends EntidadSNFC{

    private BigInteger idEntidadSnfc;
    private BigInteger idNomina;

    public EntidadSNFCDb() {
    }

    public BigInteger getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(BigInteger idNomina) {
        this.idNomina = idNomina;
    }

    public BigInteger getIdEntidadSnfc() {
        return idEntidadSnfc;
    }

    public void setIdEntidadSnfc(BigInteger idEntidadSnfc) {
        this.idEntidadSnfc = idEntidadSnfc;
    }
}
