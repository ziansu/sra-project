@org.junit.Test
public void testGetDerivative() {
    double out = instance.getOutput(input);
    double result = instance.getDerivative(input);
    assertEquals(expected_derivative, result, 1.0E-5);
}