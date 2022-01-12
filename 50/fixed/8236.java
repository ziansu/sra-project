public void waitForJavascriptFramework() {
    if ((detectedFramework) != null) {
        detectedFramework.waitToBeReady(javascriptExecutor);
    }
}