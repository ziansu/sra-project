@cucumber.api.java.en.When(value = "^enter number \"([^\"]*)\" greater than  another number \"([^\"]*)\"$")
public void enterNumberGreaterThanAnotherNumber(final java.lang.String arg1, final java.lang.String arg2) throws java.lang.Throwable {
    org.junit.Assert.assertEquals(result, arg1.equals("Y"));
}