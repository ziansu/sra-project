public final java.lang.String getTextFromLink(final rkliuha.webdriver_tasks.pageobjects.By pathToElement) {
    final java.lang.String textLink = driver.findElement(pathToElement).getText();
    return textLink;
}