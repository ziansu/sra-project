private int getHistoryLength(org.chromium.content.browser.ContentViewCore cvc) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
    getInstrumentation().waitForIdleSync();
    java.lang.String numResultsString = org.chromium.content.browser.test.util.JavaScriptUtils.executeJavaScriptAndWaitForResult(cvc.getWebContents(), "document.querySelectorAll('.entry').length");
    int numResults = java.lang.Integer.parseInt(numResultsString);
    return numResults;
}