@org.junit.Test
public void verifyJobInstanceExistsTest() {
    assertTrue(jobRepository.isJobInstanceExists(jobName, params));
}