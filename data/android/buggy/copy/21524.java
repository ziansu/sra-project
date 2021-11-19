@org.junit.Test
public void testDateToYyyyMMdd() throws java.lang.Exception {
    org.junit.Assert.assertNull(no.api.meteo.util.MeteoDateUtils.zonedDateTimeToYyyyMMdd(null));
    java.time.LocalDate dt = java.time.LocalDate.of(1977, 3, 21);
    org.junit.Assert.assertEquals("1977-03-21", no.api.meteo.util.MeteoDateUtils.zonedDateTimeToYyyyMMdd(dt));
}