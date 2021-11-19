@org.junit.Test
public void shouldNotSendMetric() throws java.lang.Exception {
    com.codahale.metrics.graphite.GraphiteSender delegate = mock(com.codahale.metrics.graphite.GraphiteSender.class);
    java.lang.String name = "metrics.http.exception.p95";
    sendValue(name, delegate);
    verifyZeroInteractions(delegate);
}