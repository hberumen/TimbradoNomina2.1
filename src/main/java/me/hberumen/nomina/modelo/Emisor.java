package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
    private RegimenFiscal regimenFiscal;
    private EntidadSNFC entidadSNCF;


    public Emisor() {

    }

    @XmlAttribute(name="rfc")
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @XmlAttribute(name="nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlAttribute(name = "RegistroPatronal")
    public String getRegistroPatronal() {
        return registroPatronal;
    }

    public void setRegistroPatronal(String registroPatronal) {
        this.registroPatronal = registroPatronal;
    }

    @XmlAttribute(name = "RfcPatronOrigen")
    public String getRfcPatronOrigen() {
        return rfcPatronOrigen;
    }

    public void setRfcPatronOrigen(String rfcPatronOrigen) {
        this.rfcPatronOrigen = rfcPatronOrigen;
    }

    @XmlElement(name = "RegimenFiscal")
    public RegimenFiscal getRegimenFiscal() {
        return regimenFiscal;
    }

    public void setRegimenFiscal(RegimenFiscal regimenFiscal) {
        this.regimenFiscal = regimenFiscal;
    }

    @XmlElement(name = "EntidadSNCF", namespace="http://www.sat.gob.mx/nomina12")
    public EntidadSNFC getEntidadSNCF() {
        return entidadSNCF;
    }

    public void setEntidadSNCF(EntidadSNFC entidadSNCF) {
        this.entidadSNCF = entidadSNCF;
    }
}
