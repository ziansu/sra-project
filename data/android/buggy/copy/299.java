@org.junit.Test
public void calculate_emptyString_returnsZero() throws java.lang.Exception {
    org.saljuama.katas.stringcalculator.StringCalculator stringCalculator = new org.saljuama.katas.stringcalculator.StringCalculatorImpl();
    java.lang.Integer result = stringCalculator.calculate("");
    org.junit.Assert.assertEquals(new java.lang.Integer(0), result);
}