public void parseEncodedXML(java.lang.String base64XmlString) throws org.xml.sax.SAXException {
    parseXML(eidassaml.starterkit.Utils.FromBase64(xmlString));
}