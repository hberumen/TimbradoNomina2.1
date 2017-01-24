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

    private BigDecimal  subsidioCausado;

    public SubsidioAlEmpleo() {
    }

    @XmlAttribute(name = "SubsidioCausado")
    public BigDecimal getSubsidioCausado() {
        return subsidioCausado;
    }

    public void setSubsidioCausado(BigDecimal subsidioCausado) {
        this.subsidioCausado = subsidioCausado;
    }


}
