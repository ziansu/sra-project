@org.junit.Test
public void testAnyFluxLocationTypeCodeContainsValueWithCorrectValue() {
    java.util.List<un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._20.FLUXLocation> fluxLocations = eu.europa.ec.fisheries.uvms.rules.service.bean.RuleTestHelper.createFluxLocationsWithPositionValue();
    assertTrue(fact.anyFluxLocationTypeCodeContainsValue(fluxLocations, "POSITION"));
}