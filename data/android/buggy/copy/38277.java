@org.junit.Test
public void testValidateDependencies() {
    org.junit.Assert.assertTrue(wizard.validateDependencies(true, true).isOK());
}