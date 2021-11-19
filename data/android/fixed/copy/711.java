@org.junit.Test
public void testIsInRangeHappy() {
    assertFalse(fact.isInRange(new java.math.BigDecimal("-9"), (-10), 200));
}