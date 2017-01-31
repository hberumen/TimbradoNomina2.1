package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

/**
 * Created by hberumen on 30/11/16.
 */
@XmlRootElement(name="CompensacionSaldosAFavor")
public class CompensacionSaldosAFavor {

    private BigDecimal saldoAFavor;
    private Integer ano;
    private BigDecimal remanenteSalFav;

    public CompensacionSaldosAFavor() {
    }

    @XmlAttribute(name = "SaldoAFavor")
    public BigDecimal getSaldoAFavor() {
        return saldoAFavor;
    }

    public void setSaldoAFavor(BigDecimal saldoAFavor) {
        this.saldoAFavor = saldoAFavor;
    }

    @XmlAttribute(name = "Año")
    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @XmlAttribute(name = "RemaneteSalFav")
    public BigDecimal getRemanenteSalFav() {
        return remanenteSalFav;
    }

    public void setRemanenteSalFav(BigDecimal remanenteSalFav) {
        this.remanenteSalFav = remanenteSalFav;
    }

}
