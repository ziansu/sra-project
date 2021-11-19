public void sendStringMessage() throws java.lang.InterruptedException {
    java.lang.System.out.println("Waiting five seconds...");
    java.lang.Thread.sleep(5000);
    java.lang.System.out.println("Sending message...");
    rabbitTemplate.convertAndSend(RabbitMQDemoConfig.queueName, "Hello from RabbitMQ!");
}