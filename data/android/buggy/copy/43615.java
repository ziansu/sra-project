public retrofit2.Call<com.onehilltech.gatekeeper.android.http.JsonBearerToken> getUserToken(java.lang.String username, java.lang.String password) {
    com.onehilltech.gatekeeper.android.http.JsonPassword grant = new com.onehilltech.gatekeeper.android.http.JsonPassword();
    grant.clientId = this.config_.clientId;
    grant.username = username;
    grant.password = password;
    return this.getToken(grant);
}