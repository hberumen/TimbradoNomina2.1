package me.hberumen.nomina.modelo.jtd;

import me.hberumen.nomina.modelo.Concepto;

import java.math.BigInteger;

/**
 * Created by hberumen on 17/01/17.
 */
public class ConceptoDb  extends Concepto{

    private BigInteger idConcepto;
    private BigInteger idComprobante;

    public ConceptoDb() {
    }

    public BigInteger getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(BigInteger idComprobante) {
        this.idComprobante = idComprobante;
    }

    public BigInteger getIdConcepto() {
        return idConcepto;
    }

    public void setIdConcepto(BigInteger idConcepto) {
        this.idConcepto = idConcepto;
    }
}
