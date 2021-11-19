@java.lang.Override
public void onClick(android.view.View v) {
    callingActivity.startActivityForResult(new android.content.Intent(android.provider.Settings.ACTION_SETTINGS), 0);
    snackbar.dismiss();
}