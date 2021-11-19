@java.lang.Override
public void close() {
    try {
        client.close();
    } catch (java.io.IOException e) {
        throw new javax.ws.rs.ProcessingException(org.glassfish.jersey.apache.connector.LocalizationMessages.FAILED_TO_STOP_CLIENT(), e);
    }
}