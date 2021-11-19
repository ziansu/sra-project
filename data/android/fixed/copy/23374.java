private static boolean isDurableTopicSubscriberQueue(java.lang.String queueName, java.lang.String virtualHost) {
    return ((null != virtualHost) && (!(virtualHost.isEmpty()))) && (queueName.startsWith(virtualHost));
}