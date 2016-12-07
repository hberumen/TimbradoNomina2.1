package me.hberumen.nomina.dao;

import me.hberumen.nomina.modelo.Emisor;

/**
 * Created by hberumen on 01/12/16.
 */
public class EmisorDao extends Emisor {

    private int idEmisor;

    public EmisorDao() {

    }

    public EmisorDao getEmisorActivo(){
        return new EmisorDao();
    }

    public int getIdEmisor() {
        return idEmisor;
    }

    public void setIdEmisor(int idEmisor) {
        this.idEmisor = idEmisor;
    }
}
