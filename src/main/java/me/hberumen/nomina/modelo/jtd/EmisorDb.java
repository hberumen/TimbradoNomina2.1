package me.hberumen.nomina.modelo.jtd;

import me.hberumen.nomina.modelo.Emisor;

/**
 * Created by hberumen on 17/01/17.
 */
public class EmisorDb  extends Emisor{

    private Integer idEmisor;

    public EmisorDb() {

    }

    public Integer getIdEmisor() {
        return idEmisor;
    }

    public void setIdEmisor(Integer idEmisor) {
        this.idEmisor = idEmisor;
    }
}
