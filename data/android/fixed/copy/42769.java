public void verifyPageTitle() {
    org.junit.Assert.assertEquals("Home page", driver.getTitle());
    log.info(("Page title is: " + (driver.getTitle())));
}