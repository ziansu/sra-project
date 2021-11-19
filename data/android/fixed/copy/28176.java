@org.testng.annotations.Test(priority = 5)
public void CheckScopeValidation() {
    appModules.APIToken_Action.ScopeValidation(driver);
    if (pageObjects.APIToken_Page.scoperror_field(driver).isDisplayed()) {
        java.lang.System.out.println("Scope validation is working ");
        org.testng.Assert.assertEquals(pageObjects.APIToken_Page.scoperror_field(driver).getText(), "Please select at least one scope");
    }
}