public io.appium.java_client.android.AndroidDriver<org.openqa.selenium.WebElement> getDriver() {
    if ((driver) == null) {
        try {
            this.initDriver();
        } catch (java.net.MalformedURLException e) {
            e.printStackTrace();
        }
    }
    return driver;
}