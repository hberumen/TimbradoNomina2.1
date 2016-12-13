package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigInteger;

/**
 * Created by hberumen on 30/11/16.
 */
@XmlRootElement(name = "SubContratacion")
public class SubContratacion {

    private BigInteger idSubcontratacion;
    private BigInteger idNomina;
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

    public BigInteger getIdSubcontratacion() {
        return idSubcontratacion;
    }

    public void setIdSubcontratacion(BigInteger idSubcontratacion) {
        this.idSubcontratacion = idSubcontratacion;
    }

    public BigInteger getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(BigInteger idNomina) {
        this.idNomina = idNomina;
    }
}
