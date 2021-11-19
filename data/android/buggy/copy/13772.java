protected void stopBrowser() {
    if ((driver) != null) {
        try {
            driver.quit();
        } catch (java.lang.Error e) {
            driver.quit();
        }
    }
}