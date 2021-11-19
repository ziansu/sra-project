private android.app.AlertDialog getAutoCheckinDialog(android.app.Activity activity, android.content.DialogInterface... checkinListeners) {
    createAutoCheckinAlertDialog(activity, checkinListeners);
    return autoCheckinDialog;
}