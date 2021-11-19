@org.junit.Test
public void test_00_Instance() {
    final com.artfulbits.benchmark.Meter meter = com.artfulbits.benchmark.Meter.getInstance();
    org.junit.Assert.assertNotNull("Expected instance of Meter class", meter);
}