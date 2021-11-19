@org.junit.Test
public void testPDFOCR() throws java.lang.Exception {
    java.lang.String resource = "/test-documents/testOCR.pdf";
    java.lang.String[] nonOCRContains = new java.lang.String[0];
    testBasicOCR(resource, nonOCRContains, 2);
}