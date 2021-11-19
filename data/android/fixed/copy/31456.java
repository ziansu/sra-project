@org.junit.Test
@org.junit.Ignore(value = "Enable when we move to Java 7")
public void createsStateDiagramInProvidedDirectory() throws java.io.FileNotFoundException {
    java.lang.String serviceName = createRadl(null, null);
    java.io.File stateDiagramFile = new java.io.File(new java.io.File(dir, serviceName), "states.png");
    org.junit.Assert.assertTrue("State diagram image not generated", stateDiagramFile.exists());
}