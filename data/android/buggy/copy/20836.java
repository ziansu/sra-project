private void signOut() {
    Auth.GoogleSignInApi.signOut(mGoogleApiClient).setResultCallback(new com.google.android.gms.common.api.ResultCallback<com.google.android.gms.common.api.Status>() {
        @java.lang.Override
        public void onResult(com.google.android.gms.common.api.Status status) {
            updateUI(false);
        }
    });
}