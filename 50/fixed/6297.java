@org.junit.Test
public void testIsBlankWhenTextTypeAndTextIsNotBlank() {
    assertFalse(fact.isBlank(new eu.europa.fisheries.uvms.rules.service.TextType().withValue("test")));
}