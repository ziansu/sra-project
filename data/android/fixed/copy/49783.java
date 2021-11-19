public static com.abiquo.apiclient.auth.OpenIDConnectAuthentication openId(final java.lang.String accessToken, final java.lang.String refreshToken, final com.abiquo.apiclient.util.Consumer<com.abiquo.apiclient.auth.OpenIDConnectAuthentication.TokenRefreshResponse> tokenConsumer) {
    return new com.abiquo.apiclient.auth.OpenIDConnectAuthentication(accessToken, refreshToken, tokenConsumer);
}