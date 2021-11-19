@org.junit.Test
public void testCheckout() throws java.lang.Exception {
    tfsCommand.checkout(workDir, revision);
    org.mockito.Mockito.verify(tfsCommand, org.mockito.Mockito.times(1)).retrieveFiles(workDir, revision);
    verifyMocks();
}