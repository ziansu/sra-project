public com.rabbitmq.client.ConnectionFactory getConnectionFactory() {
    if ((connectionFactory) == null) {
        com.rabbitmq.client.ConnectionFactory connectionFactory = new com.rabbitmq.client.ConnectionFactory();
        connectionFactory.setConnectionTimeout(1000);
        connectionFactory.setHost(host);
        connectionFactory.setPort(port);
    }
    return connectionFactory;
}