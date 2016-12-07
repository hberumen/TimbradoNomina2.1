package me.hberumen.nomina.dao;

import me.hberumen.nomina.modelo.Concepto;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hberumen on 01/12/16.
 */
public class ConceptoDao {

    private BigInteger idComprobante;

    public ConceptoDao(BigInteger idComprobante) {
    }

    public Concepto seleccionarConceptosPorIdComprobante(){
        return new Concepto();
    }

    public BigInteger getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(BigInteger idComprobante) {
        this.idComprobante = idComprobante;
    }
}
