public void deactivate(java.util.Map<java.lang.String, java.lang.Object> properties) throws javax.jms.JMSException {
    org.apache.sling.jms.JMSTopicManager.LOGGER.info("Closing session {} ", session);
    session.close();
    connection.stop();
    connection.close();
}