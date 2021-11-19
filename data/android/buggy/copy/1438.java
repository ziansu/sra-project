@org.junit.Test(expected = java.io.IOException.class)
public void testConnectWhenConnectionIsNull() throws java.lang.Exception {
    org.mockito.Mockito.when(runtimeContainerMock.getComponentData(org.mockito.Matchers.anyString(), org.mockito.Matchers.anyString())).thenReturn(null);
    snowflakeSourceOrSink.connect(runtimeContainerMock);
}