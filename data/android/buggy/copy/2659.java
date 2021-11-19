@org.testng.annotations.Test(dataProvider = "removeSpacesDP")
public void removeSpaces(java.lang.String input, java.lang.String expectedOutput) {
    org.sakuli.services.forwarder.configuration.LeadingWhitespaceRemover lwr = new org.sakuli.services.forwarder.configuration.LeadingWhitespaceRemover();
    assertEquals(lwr.removeSpaces(input), expectedOutput);
}