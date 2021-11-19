public static void cleanUp() {
    if ((tools.WebDriverFactory.driver) != null)
        tools.WebDriverFactory.driver.quit();
    
}