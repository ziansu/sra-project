@org.junit.Test
public void testServletOk() throws java.io.IOException {
    restAssured.given().get("/base/data").andReturn();
    org.junit.Assert.assertTrue(restAssured.getLastReport().isEmpty());
}