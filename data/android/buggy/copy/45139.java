@java.lang.Override
public void characters(char[] ch, int start, int length) throws org.xml.sax.SAXException {
    arrayDeque.peek().setTextConcat(new java.lang.String(ch, start, length));
}