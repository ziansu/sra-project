private void parseJobsText(java.lang.String jenkinsJobsToUse) {
    java.lang.String[] jobs = jenkinsJobsToUse.split(",");
    for (java.lang.String jobInfo : jobs) {
        parseJobInfo(jobInfo);
    }
}