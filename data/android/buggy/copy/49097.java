@java.lang.Override
public void onError(com.facebook.FacebookException exception) {
    if (((pendingAction) != (map.minimap.LoginActivity.PendingAction.NONE)) && (exception instanceof com.facebook.FacebookAuthorizationException)) {
        showAlert();
        pendingAction = map.minimap.LoginActivity.PendingAction.NONE;
    }
    android.util.Log.v(LOG_TAG, "Error!");
    updateUI();
}