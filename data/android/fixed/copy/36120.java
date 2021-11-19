@java.lang.Override
public void onActivityResult(final int requestCode, final int resultCode, final android.content.Intent intent) {
    if (requestCode == (co.apptailor.googlesignin.RNGoogleSigninModule.RC_SIGN_IN)) {
        com.google.android.gms.auth.api.signin.GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(intent);
        handleSignInResult(result, false);
    }
}