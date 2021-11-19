@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void signupNoUsername() {
    java.lang.System.out.println("signupNoUsername(): initializing...");
    org.parse4j.ParseUser parseUser = new org.parse4j.ParseUser();
    try {
        parseUser.signUp();
    } catch (org.parse4j.ParseException e) {
        org.junit.Assert.assertNull("ParseException should be null", e);
    }
}