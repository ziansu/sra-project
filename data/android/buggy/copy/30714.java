public void onClick(android.content.DialogInterface dialog, int whichButton) {
    dialog.dismiss();
    sendString("abort");
    sendString("quit");
    finish();
}