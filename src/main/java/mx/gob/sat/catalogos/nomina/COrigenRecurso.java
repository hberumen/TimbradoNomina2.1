//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.23 at 10:38:41 AM CST 
//


package mx.gob.sat.catalogos.nomina;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for c_OrigenRecurso.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="c_OrigenRecurso">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="IP"/>
 *     &lt;enumeration value="IF"/>
 *     &lt;enumeration value="IM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "c_OrigenRecurso", namespace = "http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina")
@XmlEnum
public enum COrigenRecurso {

    IP,
    IF,
    IM;

    public String value() {
        return name();
    }

    public static COrigenRecurso fromValue(String v) {
        return valueOf(v);
    }

}
