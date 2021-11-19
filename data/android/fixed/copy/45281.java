synchronized com.paypal.base.rest.OAuthTokenCredential setRefreshToken(java.lang.String refreshToken) {
    if (!(this.hasCredentials())) {
        throw new java.lang.IllegalArgumentException("ClientID and Secret are required. Please use OAuthTokenCredential(String clientID, String clientSecret)");
    }
    this.refreshToken = refreshToken;
    return this;
}