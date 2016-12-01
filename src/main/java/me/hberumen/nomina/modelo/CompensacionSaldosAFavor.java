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
    private BigDecimal RemanenteSalFav;

    public CompensacionSaldosAFavor() {
    }

    @XmlAttribute
    public BigDecimal getSaldoAFavor() {
        return saldoAFavor;
    }

    public void setSaldoAFavor(BigDecimal saldoAFavor) {
        this.saldoAFavor = saldoAFavor;
    }

    @XmlAttribute
    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @XmlAttribute
    public BigDecimal getRemanenteSalFav() {
        return RemanenteSalFav;
    }

    public void setRemanenteSalFav(BigDecimal remanenteSalFav) {
        RemanenteSalFav = remanenteSalFav;
    }
}
