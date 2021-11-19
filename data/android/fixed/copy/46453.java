private void handleErrorUpload() {
    if ((dialog) != null) {
        dialog.dismiss();
    }
    android.widget.Toast.makeText(mContext, R.string.error_has_occurred, Toast.LENGTH_SHORT).show();
    exitActivity();
}