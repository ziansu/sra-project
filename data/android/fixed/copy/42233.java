public java.util.Set<org.apache.activemq.artemis.core.client.impl.ClientConsumerInternal> cloneConsumers() {
    synchronized(consumers) {
        return new java.util.HashSet(consumers.values());
    }
}