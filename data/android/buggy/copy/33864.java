@org.testng.annotations.BeforeSuite
public void startup() {
    org.openqa.selenium.WebDriver driver = Utility.Browser.getDriver("chrome");
    new pageObjects.BaseClass(driver);
    com.aventstack.extentreports.ExtentReports reports = Utility.ExtentManager.GetExtent();
}