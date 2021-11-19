@org.junit.Test
public void testIsInRangeHappy() {
    org.junit.Assert.assertFalse(fact.isInRange(new java.math.BigDecimal("-9"), (-10), 200));
}