private static java.util.Map<java.lang.String, java.lang.String> getCustomIdentityValues(android.os.Bundle options) {
    return com.salesforce.androidsdk.util.MapUtil.addBundleToMap(options, com.salesforce.androidsdk.app.SalesforceSDKManager.getInstance().getCustomIdentityKeys(), null);
}