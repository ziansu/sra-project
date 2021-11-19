void closeAll() throws org.wso2.carbon.transport.jms.exception.JMSConnectorException {
    jmsConnectionFactory.closeMessageConsumer(messageConsumer);
    jmsConnectionFactory.closeSession(session);
    jmsConnectionFactory.closeConnection(connection);
    messageConsumer = null;
    session = null;
    connection = null;
}