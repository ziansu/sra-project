public static void sendToRetryPage(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
    request.setAttribute(FrameworkConstants.RequestParams.FLOW_STATUS, AuthenticatorFlowStatus.INCOMPLETE);
    response.sendRedirect(org.wso2.carbon.identity.core.util.IdentityUtil.getServerURL(org.wso2.carbon.identity.application.authentication.framework.config.ConfigurationFacade.getInstance().getAuthenticationEndpointRetryURL(), false, false));
}