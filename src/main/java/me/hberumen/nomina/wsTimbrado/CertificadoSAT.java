package me.hberumen.nomina.wsTimbrado;

import org.apache.xmlbeans.impl.util.Base64;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/**
 * Created by hberumen on 20/01/17.
 */
public class CertificadoSAT {

    private String certificado = "";
    private String noCertificado = "";
    private File certificadoSAT;
    private X509Certificate x509Cert;
    private String archivo = Config.PATH_SAT+Config.CERTIFICADO;

    public CertificadoSAT() throws CertificateException, IOException {
        certificadoSAT = new File(archivo);
        while(certificado.length()==0){setCertificado();};
        while(noCertificado.length()==0){setNoCertificado();};
    }


    public String setCertificado() throws CertificateException, IOException {
        x509Cert = getX509Certificate(certificadoSAT);
        certificado = new String(Base64.encode(x509Cert.getEncoded()));
        return certificado;
    }

    private X509Certificate getX509Certificate(File certificateFile) throws CertificateException,
            IOException{

        FileInputStream fis = null;

        try {
            fis = new FileInputStream(certificateFile);
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            return (X509Certificate) cf.generateCertificate(fis);
        } finally {
            if(fis != null){
                fis.close();
            }
        }

    }

    public void setNoCertificado(){

        noCertificado = "";
        BigInteger serial = x509Cert.getSerialNumber();
        byte[] sArr = serial.toByteArray();
        StringBuffer buffer = new StringBuffer();
        for(byte caracter : sArr){
            buffer.append((char) caracter);
        }
        noCertificado = buffer.toString();
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public String getNoCertificado() {
        return noCertificado;
    }

    public void setNoCertificado(String noCertificado) {
        this.noCertificado = noCertificado;
    }

    public File getCertificadoSAT() {
        return certificadoSAT;
    }

    public void setCertificadoSAT(File certificadoSAT) {
        this.certificadoSAT = certificadoSAT;
    }
}
