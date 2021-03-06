package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

/**
 * Created by hberumen on 30/11/16.
 */
@XmlRootElement(name = "EntidadSNFC")
public class EntidadSNFC {

    private String origenRecurso;
    private BigDecimal montoRecursoPropio;



    public EntidadSNFC() {
    }

    @XmlAttribute(name = "OrigenRecurso")
    public String getOrigenRecurso() {
        return origenRecurso;
    }

    public void setOrigenRecurso(String origenRecurso) {
        this.origenRecurso = origenRecurso;
    }

    @XmlAttribute(name = "MontoRecursoPropio")
    public BigDecimal getMontoRecursoPropio() {
        return montoRecursoPropio;
    }

    public void setMontoRecursoPropio(BigDecimal montoRecursoPropio) {
        this.montoRecursoPropio = montoRecursoPropio;
    }


}
