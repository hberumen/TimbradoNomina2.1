package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by hberumen on 30/11/16.
 */
@XmlRootElement(name = "SubContratacion")
public class SubContratacion {

    private String rfcLabora;
    private String porcentajeTiempo;

    public SubContratacion() {
    }

    @XmlAttribute
    public String getRfcLabora() {
        return rfcLabora;
    }

    public void setRfcLabora(String rfcLabora) {
        this.rfcLabora = rfcLabora;
    }

    @XmlAttribute
    public String getPorcentajeTiempo() {
        return porcentajeTiempo;
    }

    public void setPorcentajeTiempo(String porcentajeTiempo) {
        this.porcentajeTiempo = porcentajeTiempo;
    }
}
