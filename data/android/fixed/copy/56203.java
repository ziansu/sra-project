@java.lang.Override
public com.metabroadcast.common.http.HttpResponse call() throws java.lang.Exception {
    if ((uploadRetryCount) > 1) {
        (uploadRetryCount)++;
        log.warn("YouView upload retry count - {}", uploadRetryCount);
    }
    return httpClient.post(queryUrl, new com.metabroadcast.common.http.StringPayload(payloadString));
}