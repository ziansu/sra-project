@org.testng.annotations.Test(priority = 1)
public void validateloggedUser() {
    org.testng.Assert.assertTrue(home.verifyHomePage(), "User id is correct");
}