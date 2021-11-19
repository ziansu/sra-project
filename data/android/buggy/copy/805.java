private void launchFirefoxMarionetteDriver() {
    io.github.bonigarcia.wdm.MarionetteDriverManager.getInstance().setup("v0.10.0");
    driver = new org.openqa.selenium.firefox.MarionetteDriver();
    registerShutdownHook(driver);
}