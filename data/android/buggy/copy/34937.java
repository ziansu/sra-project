private android.app.AlertDialog getNetworkErrorDialog(android.app.Activity activity, android.content.DialogInterface.OnClickListener createNetworkListener) {
    if ((networkErrorDialog) == null) {
        createNetworkErrorDialog(activity, createNetworkListener);
    }
    return networkErrorDialog;
}