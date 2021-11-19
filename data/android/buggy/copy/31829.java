public void run() {
    running = true;
    while (running);
    com.mnxfst.testing.consumer.jms.JMSConsumerHandler.logger.info(((com.mnxfst.testing.consumer.jms.JMSConsumerHandler.class.getName()) + " shutdown"));
}