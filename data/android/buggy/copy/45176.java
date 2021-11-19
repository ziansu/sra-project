public void login(com.microsoft.windowsazure.mobileservices.authentication.MobileServiceAuthenticationProvider provider, com.google.gson.JsonObject oAuthToken, com.microsoft.windowsazure.mobileservices.UserAuthenticationCallback callback) {
    login(provider.toString(), oAuthToken, callback);
}