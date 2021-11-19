@org.junit.Test
public void testAnyFluxLocationTypeCodeContainsValueWithNullValue() {
    java.util.List<un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._20.FLUXLocation> fluxLocations = eu.europa.ec.fisheries.uvms.rules.service.bean.RuleTestHelper.createFluxLocationsWithPositionValue();
    org.junit.Assert.assertFalse(fact.anyFluxLocationTypeCodeContainsValue(fluxLocations, null));
}