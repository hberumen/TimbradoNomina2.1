package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by hberumen on 25/11/16.
 */
@XmlRootElement(name = "Complemento")
public class Complemento {

    private Nomina nomina;

    public Complemento() {
    }

    @XmlElement(namespace="http://www.sat.gob.mx/nomina")
    public Nomina getNomina() {
        return nomina;
    }

    public void setNomina(Nomina nomina) {
        this.nomina = nomina;
    }
}
