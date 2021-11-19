@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    if ((isGPSEnabled()) == true) {
        dialogInterface.dismiss();
    }else {
        this.startActivity(new android.content.Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS));
    }
}