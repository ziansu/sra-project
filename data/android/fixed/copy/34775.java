@org.junit.Test
public void createsIndexInProvidedDirectory() throws java.lang.Exception {
    java.lang.String serviceName = createRadl(null, null);
    java.io.File indexFile = new java.io.File(new java.io.File(dir, serviceName), "index.html");
    org.junit.Assert.assertTrue("Documentation not generated", indexFile.exists());
}