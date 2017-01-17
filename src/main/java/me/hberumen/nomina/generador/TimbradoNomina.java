package me.hberumen.nomina.generador;

import me.hberumen.nomina.modelo.Comprobante;
import me.hberumen.nomina.modelo.Nomina;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

/**
 * Created by hberumen on 28/11/16.
 */
public class TimbradoNomina {

    private Comprobante comprobante;

    public TimbradoNomina() {

    }

    public Comprobante getComprobante() {
        return comprobante;
    }

    public void setComprobante(Comprobante comprobante) {
        this.comprobante = comprobante;
    }


}
