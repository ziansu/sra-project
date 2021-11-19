public synchronized java.lang.String getAuthToken() {
    com.salesforce.androidsdk.util.SalesforceSDKLogger.i(com.salesforce.androidsdk.rest.RestClient.TAG, ("Found account -- get token " + (authToken)));
    return authToken;
}