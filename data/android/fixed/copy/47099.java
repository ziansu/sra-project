@org.junit.Test
public void runDoNothing() throws java.lang.Exception {
    org.mockito.Mockito.when(rootElement.getElementCount()).thenReturn(10);
    testling.run();
}