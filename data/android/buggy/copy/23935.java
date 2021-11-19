@org.junit.Test
public void testGetControllerDefinitionFileEmptyString() throws java.lang.Exception {
    org.openremote.controller.ControllerConfiguration cc = new org.openremote.controller.ControllerConfiguration();
    cc.setResourcePath("");
    java.io.File f = org.openremote.controller.deployer.Version20ModelBuilder.getControllerDefinitionFile(cc);
    junit.framework.Assert.fail("ORCJAVA-283 : Indicate configuration error with empty resource path configuration");
}