public void click(java.lang.String xpath) {
    waitElement(xpath, timeout);
    org.openqa.selenium.WebElement we = getElement(xpath);
    try {
        we.click();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}