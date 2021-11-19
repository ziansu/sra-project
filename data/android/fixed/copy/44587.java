@org.junit.After
public void after() throws java.lang.Exception {
    com.ctrip.hermes.metrics.HermesMetricsRegistry.reset();
    server.stopServer();
    kafka.stop();
    zk.stop();
}