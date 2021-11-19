public void updateListenerTestName(java.lang.String testName) {
    if (((eventListener) == null) && (org.zanata.util.ScreenshotDirForTest.isScreenshotEnabled())) {
        eventListener = new org.zanata.util.TestEventForScreenshotListener(driver);
    }
    driver = enableScreenshots();
    eventListener.updateTestID(testName);
}