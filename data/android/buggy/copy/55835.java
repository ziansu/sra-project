public void deauthenticate() {
    java.lang.String return_value = JSONSendCmd("deauthenticate", null);
    android.util.Log.d(Consts.LOG_TAG, ("Deauthenticate Return Value " + return_value));
}