@org.junit.Test(expected = StringCalculatorException.class)
public void test_negativeNumbers() throws StringCalculatorException {
    StringCalculator cal = new StringCalculator();
    int sum = cal.add("-5,6");
}