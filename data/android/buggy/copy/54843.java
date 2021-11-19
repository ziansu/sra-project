@java.lang.Override
public void closeResources() throws java.lang.Exception {
    super.closeResources();
    quitBrowserInstance(driver);
}