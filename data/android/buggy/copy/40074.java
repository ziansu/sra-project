@java.lang.Override
public void endDocument() throws org.xml.sax.SAXException {
    try {
        if ((depth) == 0) {
            writeIndent();
            flush();
        }
    } catch (org.xml.sax.SAXException e) {
        throw new org.xml.sax.SAXException(e);
    }
}