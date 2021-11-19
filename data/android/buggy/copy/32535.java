@java.lang.Override
public void onCancel() {
    if ((pendingAction) != (map.minimap.LoginActivity.PendingAction.NONE)) {
        showAlert();
        pendingAction = map.minimap.LoginActivity.PendingAction.NONE;
    }
    android.util.Log.v(LOG_TAG, "Cancelled");
    updateUI();
}