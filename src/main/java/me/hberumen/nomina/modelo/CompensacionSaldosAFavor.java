package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by hberumen on 30/11/16.
 */
@XmlRootElement(name="CompensacionSaldosAFavor")
public class CompensacionSaldosAFavor {

    private BigInteger idCompensacion;
    private BigInteger idNomina;
    private BigDecimal saldoAFavor;
    private Integer ano;
    private BigDecimal remanenteSalFav;

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
        return remanenteSalFav;
    }

    public void setRemanenteSalFav(BigDecimal remanenteSalFav) {
        remanenteSalFav = remanenteSalFav;
    }

    public BigInteger getIdCompensacion() {
        return idCompensacion;
    }

    public void setIdCompensacion(BigInteger idCompensacion) {
        this.idCompensacion = idCompensacion;
    }

    public BigInteger getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(BigInteger idNomina) {
        this.idNomina = idNomina;
    }
}
