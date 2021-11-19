public void close() {
    session.close();
    try {
        client.exit();
    } catch (net.java.otr4j.OtrException e) {
        throw new java.lang.RuntimeException(e);
    }
}