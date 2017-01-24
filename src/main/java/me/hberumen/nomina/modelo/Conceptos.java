package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by hberumen on 25/11/16.
 */
@XmlRootElement(name = "Conceptos")
public class Conceptos {

    private Concepto concepto;

    public Conceptos() {
        concepto = new Concepto();
    }

    @XmlElement(name = "Concepto")
    public Concepto getConcepto() {
        return concepto;
    }

    public void setConcepto(Concepto concepto) {
        this.concepto = concepto;
    }
}
