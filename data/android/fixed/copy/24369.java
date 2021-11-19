@org.junit.Test
public void testAnyFluxLocationTypeCodeContainsValueWithNullList() {
    assertFalse(fact.anyFluxLocationTypeCodeContainsValue(null, "POSITION"));
}