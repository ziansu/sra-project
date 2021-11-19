public void enterFrame(java.lang.String xpath) {
    waitElement(xpath, timeout);
    org.openqa.selenium.WebElement we = getElement(xpath);
    browser.switchTo().frame(we);
}