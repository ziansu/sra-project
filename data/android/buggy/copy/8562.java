public java.lang.String getSecurityToken() throws java.lang.Exception {
    java.lang.String secToken = securityToken;
    if ((secToken == null) || (secToken.isEmpty())) {
        com.ibm.streams.watsonexplorer.ca.client.ContentAnalytics.logger.trace("Security token not found! Initiating login...");
        secToken = adminLogin();
    }
    return secToken;
}