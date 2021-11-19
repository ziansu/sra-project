@org.junit.Test
public void verifyJobInstanceExistsTest() {
    org.springframework.batch.core.JobParametersBuilder builder = new org.springframework.batch.core.JobParametersBuilder();
    builder.addLong("count", 0L);
    org.springframework.batch.core.JobParameters params = builder.toJobParameters();
    assertTrue(jobRepository.isJobInstanceExists(jobName, params));
}