@java.lang.Override
protected void writeParagraphEnd() throws java.io.IOException {
    try {
        handler.endElement("p");
    } catch (org.xml.sax.SAXException e) {
        throw new org.apache.tika.io.IOExceptionWithCause("Unable to end a paragraph", e);
    }
}