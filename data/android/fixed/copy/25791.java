@org.junit.Test
public void canLoginWithRegisteredUserAndCorrectPassword() {
    java.lang.String username = UsersTestHelper.USER_NAME;
    java.lang.String password = UsersTestHelper.USER_PASSWORD;
    assertEquals(true, users.login(username, password));
}