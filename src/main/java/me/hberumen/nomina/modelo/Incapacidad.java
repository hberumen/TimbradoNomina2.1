package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

/**
 * Created by hberumen on 30/11/16.
 */
@XmlRootElement(name="Incapacidad")
public class Incapacidad {

    private int diasIncapacidad;
    private String tipoIncapacidad;
    private BigDecimal importeMonetario;

    public Incapacidad() {

    }

    @XmlAttribute
    public int getDiasIncapacidad() {
        return diasIncapacidad;
    }

    public void setDiasIncapacidad(int diasIncapacidad) {
        this.diasIncapacidad = diasIncapacidad;
    }

    @XmlAttribute
    public String getTipoIncapacidad() {
        return tipoIncapacidad;
    }

    public void setTipoIncapacidad(String tipoIncapacidad) {
        this.tipoIncapacidad = tipoIncapacidad;
    }

    @XmlAttribute
    public BigDecimal getImporteMonetario() {
        return importeMonetario;
    }

    public void setImporteMonetario(BigDecimal importeMonetario) {
        this.importeMonetario = importeMonetario;
    }
}
