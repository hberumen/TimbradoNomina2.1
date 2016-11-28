package me.hberumen.nomina.modelo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

/**
 * Created by hberumen on 28/11/16.
 */
public class TimbradoNomina {

    private  Comprobante comprobante;

    public TimbradoNomina() {
        comprobante = new Comprobante();
    }

    public Comprobante getComprobante() {
        return comprobante;
    }

    public void setComprobante(Comprobante comprobante) {
        this.comprobante = comprobante;
    }

    public void generaXml() {

        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(Comprobante.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, Comprobante.SCHEMA_SAT+ Nomina.SCHEMA_NOMINA);
            marshaller.marshal(comprobante, System.out);
            marshaller.marshal(comprobante, new File("Comprobante.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
