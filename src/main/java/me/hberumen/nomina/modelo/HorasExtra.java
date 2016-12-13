package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by hberumen on 30/11/16.
 */
@XmlRootElement(name="HorasExtra")
public class HorasExtra {

    private BigInteger idHorasExtra;
    private BigInteger idNomina;
    private Integer dias;
    private String tipoHoras;
    private Integer horasExtra;
    private BigDecimal importePagado;


    public HorasExtra() {
    }

    @XmlAttribute
    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    @XmlAttribute
    public String getTipoHoras() {
        return tipoHoras;
    }

    public void setTipoHoras(String tipoHoras) {
        this.tipoHoras = tipoHoras;
    }

    @XmlAttribute
    public Integer getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(Integer horasExtra) {
        this.horasExtra = horasExtra;
    }

    @XmlAttribute
    public BigDecimal getImportePagado() {
        return importePagado;
    }

    public void setImportePagado(BigDecimal importePagado) {
        this.importePagado = importePagado;
    }

    public BigInteger getIdHorasExtra() {
        return idHorasExtra;
    }

    public void setIdHorasExtra(BigInteger idHorasExtra) {
        this.idHorasExtra = idHorasExtra;
    }

    public BigInteger getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(BigInteger idNomina) {
        this.idNomina = idNomina;
    }
}
