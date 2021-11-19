@org.junit.Test
public void testInitializerNotThrowWhenContextIsNull() {
    when(com.microsoft.applicationinsights.extensibility.initializer.docker.DockerContextInitializerTests.contextPollerMock.getDockerContext()).thenReturn(null);
    com.microsoft.applicationinsights.extensibility.initializer.docker.DockerContextInitializerTests.initializerUnderTest.initialize(com.microsoft.applicationinsights.extensibility.initializer.docker.DockerContextInitializerTests.telemetry);
    verify(com.microsoft.applicationinsights.extensibility.initializer.docker.DockerContextInitializerTests.contextPollerMock).getDockerContext();
}