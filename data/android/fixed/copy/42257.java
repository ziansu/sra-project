@org.junit.Test
public void loadAuthenticator() throws java.lang.Exception {
    java.util.Properties props = new java.util.Properties(io.moquette.server.IntegrationUtils.prepareTestProperties());
    props.setProperty(BrokerConstants.AUTHENTICATOR_CLASS_NAME, getClass().getName());
    startServer(props);
    assertTrue(true);
}