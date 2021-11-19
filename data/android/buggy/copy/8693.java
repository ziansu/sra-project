public com.paymill.models.Subscription unpause(java.lang.String subscriptionId) {
    return this.pause(new com.paymill.models.Subscription(subscriptionId));
}