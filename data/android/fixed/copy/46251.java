@org.testng.annotations.Test
public void testCountWrap() {
    com.netflix.servo.stats.StatsBuffer buffer = getWithWrap();
    org.testng.Assert.assertEquals(buffer.getCount(), com.netflix.servo.stats.StatsBufferTest.SIZE);
}