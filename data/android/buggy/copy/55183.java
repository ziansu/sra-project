@org.junit.Test
public void testValidateFormatWhenPassingAStringAndResultIsOK() {
    boolean b = fact.validateFormat("aaa", "aaa");
    org.junit.Assert.assertTrue(b);
}