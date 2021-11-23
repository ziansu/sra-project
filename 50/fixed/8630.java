@org.junit.Test
public void testVanillaExchange() throws java.lang.Exception {
    java.lang.String output = getOutput();
    org.junit.Assert.assertTrue(("Wrong output: " + output), output.contains("Hello World"));
}