@java.lang.Override
protected void setProcess() {
    checkResultIsPassed(processPageTest("Rgaa32017.Test.10.5.1-1Passed-01"), 0);
    org.tanaguru.entity.audit.ProcessResult processResult = processPageTest("Rgaa32017.Test.10.5.1-3NMI-01");
    checkResultIsPreQualified(processResult, 1, 1);
    checkRemarkIsPresent(processResult, TestSolution.NEED_MORE_INFO, "CheckBackGroundColorPresence", null, 1, null);
}