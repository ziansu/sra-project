private java.lang.String getSecurityToken() throws java.lang.Exception {
    if (((securityToken) == null) || (securityToken.isEmpty())) {
        com.ibm.streams.watsonexplorer.ca.client.ContentAnalytics.logger.trace("Security token not found! Initiating login...");
        adminLogin();
    }
    return securityToken;
}