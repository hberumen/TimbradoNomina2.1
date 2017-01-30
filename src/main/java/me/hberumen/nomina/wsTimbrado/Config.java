package me.hberumen.nomina.wsTimbrado;

/**
 * Created by hberumen on 20/01/17.
 */
public class Config {

    /*Ruta con archivos del sat*/
    public static final String PATH_SAT = System.getProperty("user.dir")+"/src/main/resources/sat/";
    public static final String NOMINA_12 = "nomina12.xsd";
    public static final String COMPROBANTE = "cfdv32.xsd";
    public static final String CADENA_ORIGINAL = "cadenaoriginal_3_2.xslt";

    /*Nombre archivo .key*/
    public static String LLAVE 		    = "CSD_Sucursal_1_ACO560518KW7_20141124_183639.key";
    /*Nombre archivo .cer*/
    public static String CERTIFICADO 	= "20001000000300005692.cer";
    /*Contrasena LLAVE .key*/
    public static String PASS_LLAVE	    = "12345678a";
    /*Usuario PAC*/
    public static String USUARIOTIMBRE	= "";
    /*Password PAC*/
    public static String PASSTIMBRE	    = "";

}
