package me.hberumen.nomina.modelo.jtd;

import me.hberumen.nomina.modelo.RegimenFiscal;

/**
 * Created by hberumen on 17/01/17.
 */
public class RegimenFiscalDb extends RegimenFiscal {

    private int idEmisor;
    private int idRegimenFiscal;

    public RegimenFiscalDb() {
    }

    public int getIdEmisor() {
        return idEmisor;
    }

    public void setIdEmisor(int idEmisor) {
        this.idEmisor = idEmisor;
    }

    public int getIdRegimenFiscal() {
        return idRegimenFiscal;
    }

    public void setIdRegimenFiscal(int idRegimenFiscal) {
        this.idRegimenFiscal = idRegimenFiscal;
    }

}
