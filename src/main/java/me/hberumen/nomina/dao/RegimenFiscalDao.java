package me.hberumen.nomina.dao;

import me.hberumen.nomina.modelo.RegimenFiscal;

import java.math.BigInteger;

/**
 * Created by hberumen on 01/12/16.
 */
public class RegimenFiscalDao extends RegimenFiscal {

    private int idEmisor;

    public RegimenFiscalDao(int idEmisor) {
        this.idEmisor = idEmisor;
    }

    public RegimenFiscal getRegimenFiscalPorIdEmisor(){
        return new RegimenFiscal();
    }

    public int getIdEmisor() {
        return idEmisor;
    }

    public void setIdEmisor(int idEmisor) {
        this.idEmisor = idEmisor;
    }
}
