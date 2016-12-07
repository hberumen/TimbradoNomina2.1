package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

/**
 * Created by hberumen on 25/11/16.
 */
@XmlRootElement(name = "Emisor")
public class Emisor {

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-mm-dd");

    private String rfc;
    private String nombre;
    private String registroPatronal;
    private String rfcPatronOrigen;



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

    @XmlAttribute
    public String getRegistroPatronal() {
        return registroPatronal;
    }

    public void setRegistroPatronal(String registroPatronal) {
        this.registroPatronal = registroPatronal;
    }

    @XmlAttribute
    public String getRfcPatronOrigen() {
        return rfcPatronOrigen;
    }

    public void setRfcPatronOrigen(String rfcPatronOrigen) {
        this.rfcPatronOrigen = rfcPatronOrigen;
    }

}
