public static org.w3c.dom.Document unEscapeCDATAXML(java.lang.String escapedXml) {
    java.lang.String xmlString = org.apache.commons.lang3.StringEscapeUtils.unescapeXml(escapedXml);
    org.w3c.dom.Document doc = nl.thehyve.ocdu.soap.ResponseHandlers.SoapUtils.simpleString2XmlDoc(xmlString);
    return doc;
}