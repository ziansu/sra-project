@org.testng.annotations.Test
public void loginTest() {
    test = new firefoxFramework.LoginTest(profile);
    this.resizeToWindow(7);
    java.lang.System.out.println("Login test launched");
    test.begin();
    test.tearDown();
}