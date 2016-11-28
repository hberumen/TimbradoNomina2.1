package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by hberumen on 25/11/16.
 */
@XmlRootElement(name = "Emisor")
public class Emisor {

    private String rfc;
    private String nombre;

    public Emisor() {

    }

    @XmlAttribute
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @XmlAttribute
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
