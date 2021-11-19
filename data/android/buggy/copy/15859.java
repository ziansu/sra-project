public boolean isElementPresent(java.lang.String locatorWithText) {
    try {
        webDriver.findElement(org.openqa.selenium.By.xpath(locatorWithText)).isDisplayed();
        return true;
    } catch (java.lang.Exception e) {
        return false;
    }
}