@org.testng.annotations.AfterClass
public void afterClass() throws java.lang.InterruptedException {
    org.molgenis.selenium.util.SignUtil.signOut(this.driver, org.molgenis.selenium.test.AnnotatorTest.LOG);
    this.driver.manage().deleteAllCookies();
    this.driver.close();
}