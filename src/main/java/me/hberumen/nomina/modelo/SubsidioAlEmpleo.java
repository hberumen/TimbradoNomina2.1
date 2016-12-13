package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by hberumen on 30/11/16.
 */
@XmlRootElement(name="SubsidioAlEmpleo")
public class SubsidioAlEmpleo {

    private BigInteger idSubsidio;
    private BigInteger idNomina;
    private BigDecimal  subsidioCausado;

    public SubsidioAlEmpleo() {
    }

    @XmlAttribute
    public BigDecimal getSubsidioCausado() {
        return subsidioCausado;
    }

    public void setSubsidioCausado(BigDecimal subsidioCausado) {
        this.subsidioCausado = subsidioCausado;
    }

    public BigInteger getIdSubsidio() {
        return idSubsidio;
    }

    public void setIdSubsidio(BigInteger idSubsidio) {
        this.idSubsidio = idSubsidio;
    }

    public BigInteger getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(BigInteger idNomina) {
        this.idNomina = idNomina;
    }
}
