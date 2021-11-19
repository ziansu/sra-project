@org.junit.After
public void tearDown() {
    if (!(driver.equals(null))) {
        if ((isTestPass) == false) {
            utils.screenShot(pathToScreenShot, driver);
        }
        driver.quit();
    }
}