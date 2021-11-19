public org.wso2.siddhi.core.query.input.MultiProcessStreamReceiver clone(java.lang.String key) {
    return new org.wso2.siddhi.core.query.input.MultiProcessStreamReceiver(((streamId) + key), key, processCount, latencyTracker);
}