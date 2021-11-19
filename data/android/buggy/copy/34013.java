@org.testng.annotations.Test(dependsOnMethods = { "CheckMinChar" , "CheckScopeValidation" , "DuplicateName" , "AddNewToken" })
public void DeleteToken() {
    appModules.APIToken_Action.deleteToken(driver);
    driver.switchTo().alert().accept();
}