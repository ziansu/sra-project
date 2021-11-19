public void flush() throws javax.xml.stream.XMLStreamException {
    try {
        encoder.flush();
    } catch (java.io.IOException e) {
        throw new javax.xml.stream.XMLStreamException(e.getLocalizedMessage(), e);
    }
}