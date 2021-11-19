@org.junit.Test
public void resolveProvidedArg() throws java.lang.Exception {
    java.lang.Object returnValue = handlerMethod.invokeForRequest(webRequest, null, 99, "value");
    org.junit.Assert.assertEquals(java.lang.String.class, returnValue.getClass());
    org.junit.Assert.assertEquals("99-value", returnValue);
}