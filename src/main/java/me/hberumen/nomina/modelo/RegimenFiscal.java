package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by hberumen on 25/11/16.
 */
@XmlRootElement(name = "RegimenFiscal")
public class RegimenFiscal {

    private String regimen;
    private int idEmisor;
    private int idRegimenFiscal;

    public RegimenFiscal() {

    }

    @XmlAttribute
    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    public int getIdEmisor() {
        return idEmisor;
    }

    public void setIdEmisor(int idEmisor) {
        this.idEmisor = idEmisor;
    }
}
