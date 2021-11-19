@org.junit.Test
public void supportsReturnType() throws java.lang.Exception {
    org.junit.Assert.assertTrue(handler.supportsReturnType(returnParamModelAndView));
    org.junit.Assert.assertFalse(handler.supportsReturnType(getReturnValueParam("viewName")));
}