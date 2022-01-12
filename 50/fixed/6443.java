public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.dismiss();
    startActivity(new android.content.Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS));
}