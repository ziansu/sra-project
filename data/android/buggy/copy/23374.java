private static boolean isDurableTopicSubscriberQueue(java.lang.String queueName, java.lang.String virtualHost) {
    return (!(virtualHost.isEmpty())) && (queueName.startsWith(virtualHost));
}