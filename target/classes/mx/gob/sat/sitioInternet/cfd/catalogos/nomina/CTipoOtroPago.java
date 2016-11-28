/*
 * XML Type:  c_TipoOtroPago
 * Namespace: http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina
 * Java type: mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago
 *
 * Automatically generated - do not modify.
 */
package mx.gob.sat.sitioInternet.cfd.catalogos.nomina;


/**
 * An XML c_TipoOtroPago(@http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina).
 *
 * This is an atomic type that is a restriction of mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago.
 */
public interface CTipoOtroPago extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTipoOtroPago.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB774259DE45309DFF5CC640A930316F5").resolveHandle("ctipootropago0cf8type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum X_001 = Enum.forString("001");
    static final Enum X_002 = Enum.forString("002");
    static final Enum X_003 = Enum.forString("003");
    static final Enum X_004 = Enum.forString("004");
    static final Enum X_999 = Enum.forString("999");
    
    static final int INT_X_001 = Enum.INT_X_001;
    static final int INT_X_002 = Enum.INT_X_002;
    static final int INT_X_003 = Enum.INT_X_003;
    static final int INT_X_004 = Enum.INT_X_004;
    static final int INT_X_999 = Enum.INT_X_999;
    
    /**
     * Enumeration value class for mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_X_001
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
        
        static final int INT_X_001 = 1;
        static final int INT_X_002 = 2;
        static final int INT_X_003 = 3;
        static final int INT_X_004 = 4;
        static final int INT_X_999 = 5;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("001", INT_X_001),
                new Enum("002", INT_X_002),
                new Enum("003", INT_X_003),
                new Enum("004", INT_X_004),
                new Enum("999", INT_X_999),
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
        public static mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago newValue(java.lang.Object obj) {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago) type.newValue( obj ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago newInstance() {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.nomina.CTipoOtroPago) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
