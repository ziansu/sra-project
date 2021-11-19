public static java.lang.String toXMLString(foam.core.FObject obj) {
    org.w3c.dom.Document doc = foam.core.XMLSupport.createDoc();
    foam.core.XMLSupport.toXML(obj, doc);
    return foam.core.XMLSupport.toXMLString(doc);
}