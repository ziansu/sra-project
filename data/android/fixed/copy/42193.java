public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.cancel();
    startActivityForResult(new android.content.Intent(android.provider.Settings.ACTION_SETTINGS), 0);
}