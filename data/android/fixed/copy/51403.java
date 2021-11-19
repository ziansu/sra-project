@org.junit.Test
public void shouldNotThrowException() throws java.lang.Exception {
    com.izettle.metrics.influxdb.InfluxDbUdpSender influxDbUdpSender = new com.izettle.metrics.influxdb.InfluxDbUdpSender("localhost", 10080, 1000, "test", "");
    org.assertj.core.api.Assertions.assertThat(((influxDbUdpSender.writeData(new byte[0])) == 0));
}