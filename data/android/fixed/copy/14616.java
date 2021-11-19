@org.junit.Test
public void subtracts2Numbers() {
    org.junit.Assert.assertEquals(0, calc.subtract(2, 2));
    org.junit.Assert.assertEquals(1, calc.subtract(2, 1));
}