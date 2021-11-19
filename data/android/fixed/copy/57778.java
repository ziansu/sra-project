@java.lang.Override
public void characters(char[] ch, int start, int length) throws org.xml.sax.SAXException {
    content = new java.lang.String(ch, start, length);
}