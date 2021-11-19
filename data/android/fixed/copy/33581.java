@org.junit.Test
public void testSeedExampleKaliAddReturnVoid() throws java.lang.Exception {
    this.testSeedExampleKali("./examples/testKaliAddReturnVoid");
    validatePatchExistence((((fr.inria.astor.core.setup.ConfigurationProperties.getProperty("workingDirectory")) + (java.io.File.separator)) + "AstorMain-testKaliAddReturnVoid/"));
}