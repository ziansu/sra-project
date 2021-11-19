@org.junit.Test
public void testEqualPorts_actualToNullAndSameActualDefaults() {
    org.junit.Assert.assertTrue(com.google.cloud.tools.eclipse.appengine.localserver.server.LocalAppEngineServerLaunchConfigurationDelegate.equalPorts(8080, null, 8080));
}