@org.junit.Test
public void testValidateDelimitedPeriodShouldReturnTrueWhenNull() {
    org.junit.Assert.assertTrue(fact.validateDelimitedPeriod(null, true, false));
}