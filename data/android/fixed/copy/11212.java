public void endElement(java.lang.String uri, java.lang.String localName, java.lang.String qName) throws org.xml.sax.SAXException {
    if (captureElements)
        tmp.endElement(uri, localName, qName);
    
    (depth)--;
}