public void upTracsitionReblance() throws java.lang.Exception {
    if (upReblance()) {
        updateMemBrokersNodeData();
        logstashHttpClient.sendImmediatelyLoadNodeData();
        sendLogPoolData();
        logstashHttpClient.sendImmediatelyLogPoolData();
    }
}