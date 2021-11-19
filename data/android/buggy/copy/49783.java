public static com.abiquo.apiclient.auth.OpenIDConnectAuthentication openId(final java.lang.String accessToken, final java.lang.String refreshToken, final com.abiquo.apiclient.util.Consumer<com.abiquo.apiclient.auth.OpenIDConnectAuthentication.TokenRefreshResponse> tokenConsumer) {
    com.abiquo.apiclient.auth.OpenIDConnectAuthentication auth = new com.abiquo.apiclient.auth.OpenIDConnectAuthentication(accessToken, refreshToken);
    auth.tokenConsumer = com.google.common.base.Preconditions.checkNotNull(tokenConsumer, "tokenConsumer should not be null");
    return auth;
}