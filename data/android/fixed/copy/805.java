private void launchFirefoxMarionetteDriver() {
    io.github.bonigarcia.wdm.MarionetteDriverManager.getInstance().setup();
    driver = new org.openqa.selenium.firefox.MarionetteDriver();
    registerShutdownHook(driver);
}