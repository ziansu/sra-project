public org.openqa.selenium.WebDriver closeCurrentDriver() {
    org.openqa.selenium.WebDriver closedDriver = null;
    if ((getCurrentDriver()) != null) {
        closedDriver = getCurrentDriver();
        closeAndQuit(closedDriver);
        currentDriver = null;
    }
    return closedDriver;
}