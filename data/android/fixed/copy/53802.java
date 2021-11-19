public com.hkm.disqus.api.AuthTokenServiceManager createAuthenticationManager(android.content.Context context) {
    return new com.hkm.disqus.api.AuthTokenServiceManager(context, createTokenService(), _config);
}