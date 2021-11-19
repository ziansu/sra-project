@org.junit.Test
public void testValidateFormatWhenPassingAStringAndResultIsNOKBecauseArgumentIsNull() {
    boolean b = fact.validateFormat(null, null);
    org.junit.Assert.assertFalse(b);
}