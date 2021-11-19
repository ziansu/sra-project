@org.saljuama.katas.stringcalculator.Test
public void calculate_emptyString_returnsZero() throws java.lang.Exception {
    java.lang.Integer result = stringCalculator.calculate("");
    assertEquals(new java.lang.Integer(0), result);
}