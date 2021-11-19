public void onClick(android.content.DialogInterface dialog, int which) {
    bound.disconnectAll(true, false);
    waitingForDisconnectAll = false;
    setIntent(new android.content.Intent());
    if (closeOnDisconnectAll) {
        finish();
    }
}