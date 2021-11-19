private void trySend(org.hornetq.api.core.client.ClientMessage message) {
    try {
        producer.send(message);
    } catch (org.hornetq.api.core.HornetQException e) {
        pl.edu.agh.ki.to2.monitor.messaging.InMemoryMessageQueue.LOGGER.error("Message send failed", e);
    }
}