public org.bigtester.ate.browser.BrowserProfile<org.openqa.selenium.firefox.FirefoxProfile> getBrowserProfile() {
    final org.bigtester.ate.browser.BrowserProfile<org.openqa.selenium.firefox.FirefoxProfile> retVal = browserProfile;
    if (null == retVal) {
        throw new java.lang.IllegalStateException("browserProfile is not correctly populated");
    }else {
        return retVal;
    }
}