public void registerAuthenticationListener(com.concavenp.artistrymuse.services.UserAuthenticationService.OnAuthenticationListener listener) {
    android.util.Log.d(com.concavenp.artistrymuse.services.UserAuthenticationService.TAG, "registerAuthenticationListener");
    mAuthListener = listener;
}