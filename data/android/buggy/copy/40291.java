@java.lang.Override
public void onError(com.facebook.FacebookException exception) {
    com.seng480b.bumerang.utils.Utility.longToast(getApplicationContext(), getString(R.string.error_message));
    logoutFromFacebook();
}