@cucumber.api.java.en.Then(value = "^after extracting decimal result should be \"([^\"]*)\"$")
public void afterExtractingDecimalResultShouldBe(final java.lang.String arg1) throws java.lang.Throwable {
    org.junit.Assert.assertEquals(arg1, resultStr);
}