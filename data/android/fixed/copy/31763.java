public void clickAndHold(java.lang.String xpath) {
    waitElement(xpath, timeout);
    org.openqa.selenium.interactions.Actions action = new org.openqa.selenium.interactions.Actions(browser);
    org.openqa.selenium.WebElement element = getElement(xpath);
    action.clickAndHold(element).perform();
}