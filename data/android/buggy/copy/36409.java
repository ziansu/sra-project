private static java.lang.String getRealQueue(java.lang.String queueName, java.util.Map<java.lang.String, java.lang.Object> properties) {
    return (properties == null) || (properties.containsKey(uk.trainwatch.rabbitmq.RabbitMQ.NO_HOSTNAME)) ? queueName : (queueName + ".") + (uk.trainwatch.rabbitmq.RabbitMQ.getHostname());
}