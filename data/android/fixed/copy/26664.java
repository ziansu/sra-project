@java.lang.Override
public void handleDelivery(java.lang.String consumerTag, com.rabbitmq.client.Envelope envelope, com.rabbitmq.client.AMQP.BasicProperties properties, byte[] body) throws java.io.IOException {
    client.send(new java.lang.String(body, java.nio.charset.StandardCharsets.UTF_8));
}