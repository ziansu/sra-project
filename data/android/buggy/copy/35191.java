public retrofit2.Call<com.onehilltech.gatekeeper.android.http.JsonBearerToken> getClientToken() {
    com.onehilltech.gatekeeper.android.http.JsonClientCredentials credentials = new com.onehilltech.gatekeeper.android.http.JsonClientCredentials();
    credentials.clientId = this.config_.clientId;
    credentials.clientSecret = this.config_.clientSecret;
    return this.getToken(credentials);
}