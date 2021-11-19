void writeRealms(org.jboss.dmr.ModelNode subsystem, org.jboss.staxmapper.XMLExtendedStreamWriter writer) throws javax.xml.stream.XMLStreamException {
    boolean realmsStarted = false;
    realmsStarted = realmsStarted & (writeKeyStoreRealms(realmsStarted, subsystem, writer));
    if (realmsStarted) {
        writer.writeEndElement();
    }
}