@org.testng.annotations.BeforeClass(alwaysRun = true)
public void init() {
    homePage = org.openqa.selenium.support.PageFactory.initElements(getDriver(), pages.HomePage.class);
}