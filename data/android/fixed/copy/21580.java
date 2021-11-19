@org.junit.Test
public void testGetIccProfile() throws java.lang.Exception {
    org.junit.Assert.assertTrue(((rgbTest.getIccProfile()) != null));
    org.junit.Assert.assertTrue(((cmykTest.getIccProfile()) != null));
}