/*
 * XML Type:  c_TipoFactor
 * Namespace: http://www.sat.gob.mx/sitio_internet/cfd/catalogos
 * Java type: mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor
 *
 * Automatically generated - do not modify.
 */
package mx.gob.sat.sitioInternet.cfd.catalogos;


/**
 * An XML c_TipoFactor(@http://www.sat.gob.mx/sitio_internet/cfd/catalogos).
 *
 * This is an atomic type that is a restriction of mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor.
 */
public interface CTipoFactor extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTipoFactor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB774259DE45309DFF5CC640A930316F5").resolveHandle("ctipofactor1853type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum TASA = Enum.forString("Tasa");
    static final Enum CUOTA = Enum.forString("Cuota");
    static final Enum EXENTO = Enum.forString("Exento");
    
    static final int INT_TASA = Enum.INT_TASA;
    static final int INT_CUOTA = Enum.INT_CUOTA;
    static final int INT_EXENTO = Enum.INT_EXENTO;
    
    /**
     * Enumeration value class for mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_TASA
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
        
        static final int INT_TASA = 1;
        static final int INT_CUOTA = 2;
        static final int INT_EXENTO = 3;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Tasa", INT_TASA),
                new Enum("Cuota", INT_CUOTA),
                new Enum("Exento", INT_EXENTO),
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
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor newValue(java.lang.Object obj) {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor) type.newValue( obj ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor newInstance() {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mx.gob.sat.sitioInternet.cfd.catalogos.CTipoFactor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
