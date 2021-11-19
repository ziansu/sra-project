public static void finish() {
    services.WebDriverService.driver.close();
    services.WebDriverService.driver.quit();
}