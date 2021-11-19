@org.junit.Test
public void testIsBlankWhenTextTypeAndTextIsNotBlank() {
    org.junit.Assert.assertFalse(fact.isBlank(new eu.europa.fisheries.uvms.rules.service.TextType().withValue("test")));
}