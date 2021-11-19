@org.testng.annotations.Test
public void signupTest() {
    try {
        clickByClass("ldc-user-join");
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("There is no Sign-up button on the current page.");
        return ;
    }
    generateNewSignIn(17);
    clickByID("ldc-user-signup2-button");
}