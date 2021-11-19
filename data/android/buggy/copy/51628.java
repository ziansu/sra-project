public void clickText(java.lang.String text) {
    org.openqa.selenium.WebElement we = browser.findElement(org.openqa.selenium.By.partialLinkText(text));
    try {
        we.click();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}