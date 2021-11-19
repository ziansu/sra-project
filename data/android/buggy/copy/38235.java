public com.denimgroup.threadfix.selenium.pages.ScannerVulnerabilityTypesPage clickCreateNewMappingButton() {
    driver.findElementById("createNewChannelVulnModalButton").click();
    waitForElement(org.openqa.selenium.By.id("myModalLabel"));
    return new com.denimgroup.threadfix.selenium.pages.ScannerVulnerabilityTypesPage(driver);
}