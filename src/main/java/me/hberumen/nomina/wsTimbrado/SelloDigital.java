package me.hberumen.nomina.wsTimbrado;

import org.apache.xmlbeans.impl.util.Base64;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;

/**
 * Created by hberumen on 20/01/17.
 */
public class SelloDigital {

    private static final String UTF_8 = "UTF-8";
    private String xml;
    private File cadena;
    private File llave;

    public SelloDigital(String xml, File cadena, File llave) {
        this.cadena = cadena;
        this.llave = llave;
        this.xml = xml;
    }

    public String getSelloDigital(){

        try {
            String cadenaOriginal = generarCadenaOriginal();
            PrivateKey llavePrivada = getPrivateKey();
            String selloDigital = generarSelloDigital(llavePrivada,cadenaOriginal);
            return selloDigital;
        }catch (Exception e){
            e.printStackTrace();
        }

        return new String();

    }

    private String generarCadenaOriginal() throws TransformerException, IOException {

        InputStream fXml = new ByteArrayInputStream(xml.getBytes(UTF_8));

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        StreamSource sourceXML = new StreamSource(fXml);
        StreamSource sourceXSL = new StreamSource(cadena);

        TransformerFactory tFactory = TransformerFactory.newInstance();
        Transformer transformer = tFactory.newTransformer(sourceXSL);
        transformer.setParameter("encoding", UTF_8);
        transformer.setOutputProperty(OutputKeys.ENCODING, UTF_8);
        transformer.transform(sourceXML, new StreamResult(output));
        fXml.close();

        return new String(output.toByteArray(), UTF_8);

    }

    private PrivateKey getPrivateKey() throws GeneralSecurityException, IOException{

        FileInputStream fis = new FileInputStream(llave);
        org.apache.commons.ssl.PKCS8Key pkcs8 =  new org.apache.commons.ssl.PKCS8Key(fis, Config.USUARIOLLAVE.toCharArray());
        byte[] decrypted = pkcs8.getDecryptedBytes();
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(decrypted);
        PrivateKey pk = null;

        if(pkcs8.isDSA()){
            pk = KeyFactory.getInstance("DSA").generatePrivate(spec);
        } else {
            pk = KeyFactory.getInstance("RSA").generatePrivate(spec);
        }
        pk = pkcs8.getPrivateKey();

        return pk;
    }

    public static String generarSelloDigital(final PrivateKey key, final String cadenaOriginal)
            throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, UnsupportedEncodingException{

        Signature firma = Signature.getInstance("SHA1withRSA");
        firma.initSign(key, new SecureRandom());
        firma.update(cadenaOriginal.getBytes(UTF_8));
        byte[] firmaArr = firma.sign();

        return new String(Base64.encode(firmaArr));

    }
}
