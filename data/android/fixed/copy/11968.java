@java.lang.Override
public void onAuthenticationSucceeded(android.support.v4.hardware.fingerprint.FingerprintManagerCompat.AuthenticationResult result) {
    super.onAuthenticationSucceeded(result);
    if ((promise) == null) {
        return ;
    }
    promise.resolve(null);
    promise = null;
}