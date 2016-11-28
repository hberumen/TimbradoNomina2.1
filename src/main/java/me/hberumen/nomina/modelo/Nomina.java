package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * Created by hberumen on 25/11/16.
 */
@XmlRootElement(namespace="http://www.sat.gob.mx/nomina", name="Nomina")
public class Nomina {

    public static final String SCHEMA_NOMINA = "http://www.sat.gob.mx/nomina http://www.sat.gob.mx/sitio_internet/cfd/nomina/nomina12.xsd";

    private String version;
    private String tipoNomina;

    public Nomina() {

    }

    @XmlAttribute
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @XmlAttribute
    public String getTipoNomina() {
        return tipoNomina;
    }

    public void setTipoNomina(String tipoNomina) {
        this.tipoNomina = tipoNomina;
    }
}
