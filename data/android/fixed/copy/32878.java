@org.junit.Test
public void validElementNameShouldBeLongerThanOneLetter() throws java.lang.Exception {
    org.junit.Assert.assertTrue(chemicalSymbol.validElement("Boron"));
    org.junit.Assert.assertFalse(chemicalSymbol.validElement("B"));
    org.junit.Assert.assertFalse(chemicalSymbol.validElement("true"));
}