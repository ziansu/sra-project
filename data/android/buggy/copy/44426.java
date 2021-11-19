private boolean filterPageLoadTime(com.gtmetrix.TestResult result) {
    return (result.getPageLoadTime()) < 9000;
}