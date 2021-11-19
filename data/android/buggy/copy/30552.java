@java.lang.Override
public void characters(char[] ch, int start, int length) throws org.xml.sax.SAXException {
    stringBuffer = new java.lang.StringBuffer(256);
    stringBuffer.append(ch, start, length);
}