package me.hberumen.nomina.util;

/**
 * Created by hberumen on 16/01/17.
 */
public enum Eutil {

    CONCEPTO_DESCRIPCION("Pago de nómina"),
    CONCEPTO_UNIDAD("ACT"),
    COMPROBANTE_VERSION("3.2"),
    COMPROBANTE_FORMA_DE_PAGO("En una sola exhibición"),
    COMPROBANTE_TIPO_CAMBIO("1"),
    COMPROBANTE_TIPO_COMPROBANTE("egreso"),
    COMPROBANTE_MONEDA("MXN"),
    COMPROBANTE_METODO_DE_PAGO("NA"),
    EMISOR_REGIMEN_FISCAL("Personas Morales con Fines no Lucrativos"),
    NOMINA_VERSION("1.2");



    private String valor;
    Eutil(String valor){
        this.valor = valor;
    }

    public String getValor(){
        return valor;
    }
}
