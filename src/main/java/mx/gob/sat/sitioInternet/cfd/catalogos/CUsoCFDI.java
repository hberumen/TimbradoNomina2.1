/*
 * XML Type:  c_UsoCFDI
 * Namespace: http://www.sat.gob.mx/sitio_internet/cfd/catalogos
 * Java type: mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI
 *
 * Automatically generated - do not modify.
 */
package mx.gob.sat.sitioInternet.cfd.catalogos;


/**
 * An XML c_UsoCFDI(@http://www.sat.gob.mx/sitio_internet/cfd/catalogos).
 *
 * This is an atomic type that is a restriction of mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI.
 */
public interface CUsoCFDI extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CUsoCFDI.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB774259DE45309DFF5CC640A930316F5").resolveHandle("cusocfdie3e7type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum G_01 = Enum.forString("G01");
    static final Enum G_02 = Enum.forString("G02");
    static final Enum G_03 = Enum.forString("G03");
    static final Enum I_01 = Enum.forString("I01");
    static final Enum I_02 = Enum.forString("I02");
    static final Enum I_03 = Enum.forString("I03");
    static final Enum I_04 = Enum.forString("I04");
    static final Enum I_05 = Enum.forString("I05");
    static final Enum I_06 = Enum.forString("I06");
    static final Enum I_07 = Enum.forString("I07");
    static final Enum I_08 = Enum.forString("I08");
    static final Enum D_01 = Enum.forString("D01");
    static final Enum D_02 = Enum.forString("D02");
    static final Enum D_03 = Enum.forString("D03");
    static final Enum D_04 = Enum.forString("D04");
    static final Enum D_05 = Enum.forString("D05");
    static final Enum D_06 = Enum.forString("D06");
    static final Enum D_07 = Enum.forString("D07");
    static final Enum D_08 = Enum.forString("D08");
    static final Enum D_09 = Enum.forString("D09");
    static final Enum D_10 = Enum.forString("D10");
    static final Enum P_01 = Enum.forString("P01");
    
    static final int INT_G_01 = Enum.INT_G_01;
    static final int INT_G_02 = Enum.INT_G_02;
    static final int INT_G_03 = Enum.INT_G_03;
    static final int INT_I_01 = Enum.INT_I_01;
    static final int INT_I_02 = Enum.INT_I_02;
    static final int INT_I_03 = Enum.INT_I_03;
    static final int INT_I_04 = Enum.INT_I_04;
    static final int INT_I_05 = Enum.INT_I_05;
    static final int INT_I_06 = Enum.INT_I_06;
    static final int INT_I_07 = Enum.INT_I_07;
    static final int INT_I_08 = Enum.INT_I_08;
    static final int INT_D_01 = Enum.INT_D_01;
    static final int INT_D_02 = Enum.INT_D_02;
    static final int INT_D_03 = Enum.INT_D_03;
    static final int INT_D_04 = Enum.INT_D_04;
    static final int INT_D_05 = Enum.INT_D_05;
    static final int INT_D_06 = Enum.INT_D_06;
    static final int INT_D_07 = Enum.INT_D_07;
    static final int INT_D_08 = Enum.INT_D_08;
    static final int INT_D_09 = Enum.INT_D_09;
    static final int INT_D_10 = Enum.INT_D_10;
    static final int INT_P_01 = Enum.INT_P_01;
    
    /**
     * Enumeration value class for mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_G_01
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_G_01 = 1;
        static final int INT_G_02 = 2;
        static final int INT_G_03 = 3;
        static final int INT_I_01 = 4;
        static final int INT_I_02 = 5;
        static final int INT_I_03 = 6;
        static final int INT_I_04 = 7;
        static final int INT_I_05 = 8;
        static final int INT_I_06 = 9;
        static final int INT_I_07 = 10;
        static final int INT_I_08 = 11;
        static final int INT_D_01 = 12;
        static final int INT_D_02 = 13;
        static final int INT_D_03 = 14;
        static final int INT_D_04 = 15;
        static final int INT_D_05 = 16;
        static final int INT_D_06 = 17;
        static final int INT_D_07 = 18;
        static final int INT_D_08 = 19;
        static final int INT_D_09 = 20;
        static final int INT_D_10 = 21;
        static final int INT_P_01 = 22;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("G01", INT_G_01),
                new Enum("G02", INT_G_02),
                new Enum("G03", INT_G_03),
                new Enum("I01", INT_I_01),
                new Enum("I02", INT_I_02),
                new Enum("I03", INT_I_03),
                new Enum("I04", INT_I_04),
                new Enum("I05", INT_I_05),
                new Enum("I06", INT_I_06),
                new Enum("I07", INT_I_07),
                new Enum("I08", INT_I_08),
                new Enum("D01", INT_D_01),
                new Enum("D02", INT_D_02),
                new Enum("D03", INT_D_03),
                new Enum("D04", INT_D_04),
                new Enum("D05", INT_D_05),
                new Enum("D06", INT_D_06),
                new Enum("D07", INT_D_07),
                new Enum("D08", INT_D_08),
                new Enum("D09", INT_D_09),
                new Enum("D10", INT_D_10),
                new Enum("P01", INT_P_01),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI newValue(java.lang.Object obj) {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI) type.newValue( obj ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI newInstance() {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CUsoCFDI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
