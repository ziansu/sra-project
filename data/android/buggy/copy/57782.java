public java.lang.String generateReport() {
    java.util.List<org.springframework.batch.core.JobInstance> jobInstanceList = jobExplorer.findJobInstancesByJobName(BatchConfiguration.FULL_DATA_EXPORT_JOB_NAME, 1, 20);
    java.util.List<org.bahmni.batch.report.JobResult> results = transformJobExecutionsToReport(getJobExecutionsForInstances(jobInstanceList));
    return evaluator.evaluate("report.ftl", results);
}