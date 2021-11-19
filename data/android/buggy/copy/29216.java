public static java.lang.String toXMLString(java.util.List<foam.core.FObject> objArray) {
    org.w3c.dom.Document doc = foam.core.XMLSupport.createDoc();
    foam.core.XMLSupport.toXML(objArray, doc);
    return foam.core.XMLSupport.toXMLString(doc);
}