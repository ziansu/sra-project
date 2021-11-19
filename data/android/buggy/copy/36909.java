@org.junit.Test
public void cannotLoginWithUserNameThatDoesNotExist() {
    java.lang.String username = UsersTestHelper.NOSUCHUSER;
    java.lang.String password = UsersTestHelper.DOESNTMATTER;
    org.junit.Assert.assertFalse(users.login(username, password));
}