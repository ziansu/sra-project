@org.testng.annotations.Test
public void testGetInstance() {
    org.wso2.carbon.identity.application.authz.xacml.handler.impl.XACMLBasedAuthorizationHandler xacmlBasedAuthorizationHandler = org.wso2.carbon.identity.application.authz.xacml.handler.impl.XACMLBasedAuthorizationHandler.getInstance();
    org.testng.Assert.assertNotNull(xacmlBasedAuthorizationHandler);
    org.testng.Assert.assertEquals(org.wso2.carbon.identity.application.authz.xacml.handler.impl.XACMLBasedAuthorizationHandler.getInstance(), xacmlBasedAuthorizationHandler);
}