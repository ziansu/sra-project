private com.google.android.gms.common.api.GoogleApiClient buildGoogleApiClient(com.google.android.gms.auth.api.signin.GoogleSignInOptions gso) {
    return new com.google.android.gms.common.api.GoogleApiClient.Builder(this).enableAutoManage(this, this).addApi(Auth.GOOGLE_SIGN_IN_API, gso).build();
}