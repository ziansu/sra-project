public void checkInvalidConfirmPassword(ru.fil7.test.hello.user.model.User user) {
    java.lang.String userPassword = user.getPassword();
    java.lang.String userConfirmPassword = user.getConfirmPassword();
    org.junit.Assert.assertEquals(userPassword, userConfirmPassword);
    checkInvalidField(confirmPassword, userConfirmPassword, ru.fil7.test.hello.user.selenium.pages.SignUpPage.errorOfConfirmPassword);
}