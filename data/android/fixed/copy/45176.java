public void login(com.microsoft.windowsazure.mobileservices.authentication.MobileServiceAuthenticationProvider provider, com.google.gson.JsonObject oAuthToken, java.util.HashMap<java.lang.String, java.lang.String> parameters, com.microsoft.windowsazure.mobileservices.UserAuthenticationCallback callback) {
    login(provider.toString(), oAuthToken, parameters, callback);
}