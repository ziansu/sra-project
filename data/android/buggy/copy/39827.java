public void SelectCreatedTO(java.lang.String tOname) throws java.lang.InterruptedException {
    utils.OpenPlus.expandAll();
    driver.findElement(org.openqa.selenium.By.partialLinkText(tOname)).click();
    java.lang.Thread.sleep(500);
}