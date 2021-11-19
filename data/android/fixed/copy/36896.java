private void parseJobsText(java.lang.String jenkinsJobsToUse) {
    if (jenkinsJobsToUse == null) {
        return ;
    }
    java.lang.String[] jobs = jenkinsJobsToUse.split(",");
    for (java.lang.String jobInfo : jobs) {
        parseJobInfo(jobInfo);
    }
}