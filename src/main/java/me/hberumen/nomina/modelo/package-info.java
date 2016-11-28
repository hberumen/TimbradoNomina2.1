/**
 * Created by hberumen on 25/11/16.
 */
@XmlSchema(namespace = "http://www.sat.gob.mx/cfd/3",
        xmlns = {
                @XmlNs(namespaceURI = "http://www.sat.gob.mx/nomina", prefix = "nomina"),
                @XmlNs(namespaceURI = "http://www.sat.gob.mx/cfd/3", prefix = "cfdi"),
                @XmlNs(namespaceURI = "http://www.w3.org/2001/XMLSchema-instance", prefix = "xsi")
        },
        elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED)


package  me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlSchema;
