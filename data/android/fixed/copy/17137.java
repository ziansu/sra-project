@org.junit.Test
public void resolveProvidedArg() throws java.lang.Exception {
    java.lang.Object returnValue = handlerMethod.invokeForRequest(webRequest, null, 99, "value");
    assertEquals(java.lang.String.class, returnValue.getClass());
    assertEquals("99-value", returnValue);
}