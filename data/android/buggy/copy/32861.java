@java.lang.Override
public void onResult(@android.support.annotation.NonNull
com.google.android.gms.auth.api.signin.GoogleSignInResult googleSignInResult) {
    mGoogleApiClient.disconnect();
    handleGoogleResult(googleSignInResult, callback);
}