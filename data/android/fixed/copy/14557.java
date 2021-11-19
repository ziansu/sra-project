public static void main(java.lang.String[] args) throws java.lang.Exception {
    com.de.grossmann.carthago.App.LOGGER.debug("<START>");
    new com.de.grossmann.carthago.protocol.odette.OFTPClient("MyTestServer", 3305, com.de.grossmann.carthago.protocol.odette.codec.Transport.TCP);
}