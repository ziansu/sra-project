@org.junit.Test
public void login_incorrect_username() throws java.lang.Exception {
    assertEquals(purdue.bowlingapp.MainActivity.isValidLogin(false), false);
}