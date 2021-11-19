public void login(java.lang.String provider, com.google.gson.JsonObject oAuthToken, com.microsoft.windowsazure.mobileservices.UserAuthenticationCallback callback) {
    if (oAuthToken == null) {
        throw new java.lang.IllegalArgumentException("oAuthToken cannot be null");
    }
    login(provider, oAuthToken.toString(), callback);
}