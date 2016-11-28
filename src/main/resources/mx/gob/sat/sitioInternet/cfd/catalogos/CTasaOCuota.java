/*
 * XML Type:  c_TasaOCuota
 * Namespace: http://www.sat.gob.mx/sitio_internet/cfd/catalogos
 * Java type: mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota
 *
 * Automatically generated - do not modify.
 */
package mx.gob.sat.sitioInternet.cfd.catalogos;


/**
 * An XML c_TasaOCuota(@http://www.sat.gob.mx/sitio_internet/cfd/catalogos).
 *
 * This is an atomic type that is a restriction of mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota.
 */
public interface CTasaOCuota extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTasaOCuota.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB774259DE45309DFF5CC640A930316F5").resolveHandle("ctasaocuota3780type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum X_0_000000 = Enum.forString("0.000000");
    static final Enum X_0_160000 = Enum.forString("0.160000");
    static final Enum X_0_265000 = Enum.forString("0.265000");
    static final Enum X_0_300000 = Enum.forString("0.300000");
    static final Enum X_0_530000 = Enum.forString("0.530000");
    static final Enum X_0_500000 = Enum.forString("0.500000");
    static final Enum X_1_600000 = Enum.forString("1.600000");
    static final Enum X_0_304000 = Enum.forString("0.304000");
    static final Enum X_0_350000 = Enum.forString("0.350000");
    static final Enum X_0_059100 = Enum.forString("0.059100");
    static final Enum X_3_000000 = Enum.forString("3.000000");
    static final Enum X_0_298800 = Enum.forString("0.298800");
    
    static final int INT_X_0_000000 = Enum.INT_X_0_000000;
    static final int INT_X_0_160000 = Enum.INT_X_0_160000;
    static final int INT_X_0_265000 = Enum.INT_X_0_265000;
    static final int INT_X_0_300000 = Enum.INT_X_0_300000;
    static final int INT_X_0_530000 = Enum.INT_X_0_530000;
    static final int INT_X_0_500000 = Enum.INT_X_0_500000;
    static final int INT_X_1_600000 = Enum.INT_X_1_600000;
    static final int INT_X_0_304000 = Enum.INT_X_0_304000;
    static final int INT_X_0_350000 = Enum.INT_X_0_350000;
    static final int INT_X_0_059100 = Enum.INT_X_0_059100;
    static final int INT_X_3_000000 = Enum.INT_X_3_000000;
    static final int INT_X_0_298800 = Enum.INT_X_0_298800;
    
    /**
     * Enumeration value class for mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_X_0_000000
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
        
        static final int INT_X_0_000000 = 1;
        static final int INT_X_0_160000 = 2;
        static final int INT_X_0_265000 = 3;
        static final int INT_X_0_300000 = 4;
        static final int INT_X_0_530000 = 5;
        static final int INT_X_0_500000 = 6;
        static final int INT_X_1_600000 = 7;
        static final int INT_X_0_304000 = 8;
        static final int INT_X_0_350000 = 9;
        static final int INT_X_0_059100 = 10;
        static final int INT_X_3_000000 = 11;
        static final int INT_X_0_298800 = 12;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("0.000000", INT_X_0_000000),
                new Enum("0.160000", INT_X_0_160000),
                new Enum("0.265000", INT_X_0_265000),
                new Enum("0.300000", INT_X_0_300000),
                new Enum("0.530000", INT_X_0_530000),
                new Enum("0.500000", INT_X_0_500000),
                new Enum("1.600000", INT_X_1_600000),
                new Enum("0.304000", INT_X_0_304000),
                new Enum("0.350000", INT_X_0_350000),
                new Enum("0.059100", INT_X_0_059100),
                new Enum("3.000000", INT_X_3_000000),
                new Enum("0.298800", INT_X_0_298800),
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
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota newValue(java.lang.Object obj) {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota) type.newValue( obj ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota newInstance() {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTasaOCuota) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
