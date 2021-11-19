@org.junit.Test
public void tests_getID_returns_ContactID() {
    int expected = 100;
    org.junit.Assert.assertEquals(expected, contact.getID());
}