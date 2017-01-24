package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * Created by hberumen on 25/11/16.
 */
@XmlRootElement(name = "Receptor")
public class Receptor {


    private String rfc;
    private String nombre;
    private String curp;
    private String numSeguridadSocial;
    private String fechaInicioRelacionLaboral;
    private String antiguedad;
    private String tipoContrato;
    private String sindicalizado;
    private String tipoJornada;
    private String tipoRegimen;
    private String numEmpleado;
    private String departamento;
    private String puesto;
    private String riesgoPuesto;
    private String periodicidadPago;
    private String banco;
    private String cuentaBancaria;
    private BigDecimal salarioBaseCotApor;
    private BigDecimal salarioDiarioIntegrado;
    private String claveEntFed;

    private SubContratacion subContratacion;


    public Receptor() {

    }

    @XmlAttribute(name="rfc")
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @XmlAttribute(name="nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlAttribute(name = "Curp")
    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    @XmlAttribute(name = "NumSeguridadSocial")
    public String getNumSeguridadSocial() {
        return numSeguridadSocial;
    }

    public void setNumSeguridadSocial(String numSeguridadSocial) {
        this.numSeguridadSocial = numSeguridadSocial;
    }

    @XmlAttribute(name = "FechaInicioRelLaboral")
    public String getFechaInicioRelacionLaboral() {
        return fechaInicioRelacionLaboral;
    }

    public void setFechaInicioRelacionLaboral(String fechaInicioRelacionLaboral) {
        this.fechaInicioRelacionLaboral = fechaInicioRelacionLaboral;
    }

    @XmlAttribute(name = "Antigüedad")
    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    @XmlAttribute(name = "TipoContrato")
    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    @XmlAttribute(name = "Sindicalizado")
    public String getSindicalizado() {
        return sindicalizado;
    }

    public void setSindicalizado(String sindicalizado) {
        this.sindicalizado = sindicalizado;
    }

    @XmlAttribute(name = "TipoJornada")
    public String getTipoJornada() {
        return tipoJornada;
    }

    public void setTipoJornada(String tipoJornada) {
        this.tipoJornada = tipoJornada;
    }

    @XmlAttribute(name = "TipoRegimen")
    public String getTipoRegimen() {
        return tipoRegimen;
    }

    public void setTipoRegimen(String tipoRegimen) {
        this.tipoRegimen = tipoRegimen;
    }

    @XmlAttribute(name = "NumEmpleado")
    public String getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(String numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    @XmlAttribute(name = "Departamento")
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @XmlAttribute(name = "Puesto")
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @XmlAttribute(name = "RiesgoPuesto")
    public String getRiesgoPuesto() {
        return riesgoPuesto;
    }

    public void setRiesgoPuesto(String riesgoPuesto) {
        this.riesgoPuesto = riesgoPuesto;
    }

    @XmlAttribute(name = "PeriodicidadPago")
    public String getPeriodicidadPago() {
        return periodicidadPago;
    }

    public void setPeriodicidadPago(String periodicidadPago) {
        this.periodicidadPago = periodicidadPago;
    }

    @XmlAttribute(name = "Banco")
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    @XmlAttribute(name = "CuentaBancaria")
    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    @XmlAttribute(name = "SalarioBaseCotApor")
    public BigDecimal getSalarioBaseCotApor() {
        return salarioBaseCotApor;
    }

    public void setSalarioBaseCotApor(BigDecimal salarioBaseCotApor) {
        this.salarioBaseCotApor = salarioBaseCotApor;
    }

    @XmlAttribute(name = "SalarioDiarioIntegrado")
    public BigDecimal getSalarioDiarioIntegrado() {
        return salarioDiarioIntegrado;
    }

    public void setSalarioDiarioIntegrado(BigDecimal salarioDiarioIntegrado) {
        this.salarioDiarioIntegrado = salarioDiarioIntegrado;
    }

    @XmlElement(namespace="http://www.sat.gob.mx/nomina12")
    public SubContratacion getSubContratacion() {
        return subContratacion;
    }

    public void setSubContratacion(SubContratacion subContratacion) {
        this.subContratacion = subContratacion;
    }

    @XmlAttribute(name = "ClaveEntFed")
    public String getClaveEntFed() {
        return claveEntFed;
    }

    public void setClaveEntFed(String claveEntFed) {
        this.claveEntFed = claveEntFed;
    }
}
