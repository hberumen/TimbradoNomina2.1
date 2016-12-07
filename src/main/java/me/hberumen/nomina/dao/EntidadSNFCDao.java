package me.hberumen.nomina.dao;

import me.hberumen.nomina.modelo.EntidadSNFC;

import java.math.BigInteger;

/**
 * Created by hberumen on 01/12/16.
 */
public class EntidadSNFCDao  extends EntidadSNFC{

    private BigInteger idNomina;

    public EntidadSNFCDao(BigInteger idNomina) {
        this.idNomina = idNomina;
    }

    public EntidadSNFC seleccionarEntidadSNFCPorIdNomina(){
        return new EntidadSNFC();
    }
}
