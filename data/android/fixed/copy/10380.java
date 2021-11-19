public void click(java.lang.String xpath) {
    waitElement(xpath, timeout);
    org.openqa.selenium.WebElement element = getElement(xpath);
    try {
        element.click();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}