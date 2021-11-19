public hudson.plugins.testng.Publisher getNewPublisher() {
    return new hudson.plugins.testng.Publisher(reportFilenamePattern, escapeTestDescp, failureOnFailedTestConfig, escapeExceptionMsg, showFailedBuilds, unstableSkips, unstableFails, failedSkips, failedFails, thresholdMode);
}