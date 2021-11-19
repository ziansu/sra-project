@org.junit.Before
public void TestSetUp() {
    SelCommonElements = new PageObjects.CommonObj(driver);
    java.lang.System.out.println("Driver loaded before test");
}