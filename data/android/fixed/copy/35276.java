@org.junit.Test
public void testYyyyMMddToDate() throws java.lang.Exception {
    java.time.LocalDate localDate = yyyyMMddToLocalDate("2011-05-10");
    org.junit.Assert.assertNotNull(localDate);
    org.junit.Assert.assertEquals("2011-05-10", localDate.toString());
}