@org.junit.Test
public void testIsBlankWhenTextTypeAndTextIsNull() {
    assertTrue(fact.isBlank(((eu.europa.fisheries.uvms.rules.service.TextType) (null))));
}