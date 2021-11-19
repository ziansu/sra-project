@org.junit.Test(expected = java.security.InvalidParameterException.class)
public void testLambdaRequestIncompatibleValueValidation() throws java.lang.Exception {
    new io.skygear.skygear.LambdaRequest("test:op1", new java.lang.Object[]{ new java.util.Date() });
}