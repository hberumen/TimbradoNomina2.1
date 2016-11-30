package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by hberumen on 30/11/16.
 */
@XmlRootElement(name="Incapacidades")
public class Incapacidades {

    private Incapacidad incapacidad;

    public Incapacidades() {
        incapacidad = new Incapacidad();
    }

    public Incapacidad getIncapacidad() {
        return incapacidad;
    }

    public void setIncapacidad(Incapacidad incapacidad) {
        this.incapacidad = incapacidad;
    }
}
