@org.junit.Test
public void testIsBlankWhenTextTypeAndTextIsEmptyString() {
    org.junit.Assert.assertTrue(fact.isBlank(new eu.europa.fisheries.uvms.rules.service.TextType().withValue("")));
}