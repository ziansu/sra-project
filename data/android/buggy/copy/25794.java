@org.junit.Test
public final void testLoggingDir() {
    nl.tudelft.scrumbledore.Logger.getInstance();
    java.io.File loggingDir = new java.io.File(((Constants.APPDATA_DIR) + (Constants.LOGGER_DIR)));
    org.junit.Assert.assertTrue(loggingDir.exists());
}