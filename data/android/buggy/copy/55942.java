public void login(com.microsoft.windowsazure.mobileservices.authentication.MobileServiceAuthenticationProvider provider, java.lang.String oAuthToken, com.microsoft.windowsazure.mobileservices.UserAuthenticationCallback callback) {
    login(provider.toString(), oAuthToken, callback);
}