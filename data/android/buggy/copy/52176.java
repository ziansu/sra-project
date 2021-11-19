@org.junit.After
public void tearDown() {
    com.thoughtworks.go.config.GuidService.deleteGuid();
    java.lang.System.clearProperty(SystemEnvironment.WEBSOCKET_ENABLED.propertyName());
    java.lang.System.clearProperty(SystemEnvironment.CONSOLE_LOGS_THROUGH_WEBSOCKET_ENABLED.propertyName());
}