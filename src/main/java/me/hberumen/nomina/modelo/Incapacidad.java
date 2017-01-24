package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by hberumen on 30/11/16.
 */
@XmlRootElement(name="Incapacidad")
public class Incapacidad {

    private Integer diasIncapacidad;
    private String tipoIncapacidad;
    private BigDecimal importeMonetario;

    public Incapacidad() {

    }

    @XmlAttribute(name = "DiasIncapacidad")
    public Integer getDiasIncapacidad() {
        return diasIncapacidad;
    }

    public void setDiasIncapacidad(Integer diasIncapacidad) {
        this.diasIncapacidad = diasIncapacidad;
    }

    @XmlAttribute(name = "TipoIncapacidad")
    public String getTipoIncapacidad() {
        return tipoIncapacidad;
    }

    public void setTipoIncapacidad(String tipoIncapacidad) {
        this.tipoIncapacidad = tipoIncapacidad;
    }

    @XmlAttribute(name = "ImporteMonetario")
    public BigDecimal getImporteMonetario() {
        return importeMonetario;
    }

    public void setImporteMonetario(BigDecimal importeMonetario) {
        this.importeMonetario = importeMonetario;
    }


}
