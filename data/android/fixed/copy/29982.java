@org.testng.annotations.Test
public void testMeanWrap() {
    com.netflix.servo.stats.StatsBuffer buffer = getWithWrap();
    org.testng.Assert.assertEquals(buffer.getMean(), (((double) (com.netflix.servo.stats.StatsBufferTest.EXPECTED_TOTAL_WRAP)) / (com.netflix.servo.stats.StatsBufferTest.SIZE)));
}