public void computeNonce() {
    nonce = java.lang.Long.toHexString(((com.google.api.client.auth.oauth.OAuthParameters.RANDOM.nextLong()) >>> 1));
}