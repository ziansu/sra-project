public static boolean getDebug() throws org.apache.commons.configuration.ConfigurationException {
    boolean debug = ((java.lang.Boolean) (com.redhat.telemetry.integration.sat5.util.PropertiesHandler.getProperty(Constants.DEBUG_PROPERTY, Constants.BOOLEAN_TYPE, false)));
    return debug;
}