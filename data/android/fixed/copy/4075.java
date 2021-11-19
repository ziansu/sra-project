public void onClick(android.content.DialogInterface dialog, int which) {
    if (!(SendIMEI())) {
        SendIMEIFailedDialog().show();
    }
    dialog.cancel();
}