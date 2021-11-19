@org.junit.Test
public void testLocalDateToYyyyMMdd() throws java.lang.Exception {
    java.time.LocalDate firstDate = java.time.LocalDate.of(2010, 5, 17);
    org.junit.Assert.assertEquals("2010-05-17", no.api.meteo.util.MeteoDateUtils.zonedDateTimeToYyyyMMdd(firstDate));
}