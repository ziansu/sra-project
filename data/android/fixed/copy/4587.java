public synchronized java.util.List<org.apache.kafka.common.Node> nodes() {
    return new java.util.ArrayList(unsent.keySet());
}