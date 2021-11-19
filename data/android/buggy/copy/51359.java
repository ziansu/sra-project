public com.datastax.driver.core.policies.ErrorAwarePolicy build() {
    return new com.datastax.driver.core.policies.ErrorAwarePolicy(childPolicy, errorTracker, updatePeriod, errorsPerSecThreshold, retryPeriod);
}