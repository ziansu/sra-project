@org.junit.Test
public void testAuthenticateUserOK() {
    java.util.List<java.lang.String> result = facade.authenticateUser("user", "test");
    assertEquals("User should have one role", 10, result.size());
}