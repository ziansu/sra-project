@org.junit.Test
public void testGetAllSorted() throws java.lang.Exception {
    log.info("testGetAllSorted");
    org.junit.Assert.assertEquals(storage.getAllSorted(), java.util.Arrays.asList(ru.timurnav.resume.TestData.TIMURS_RESUME, ru.timurnav.resume.TestData.OTHERS_RESUME));
}