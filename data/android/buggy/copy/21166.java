@java.lang.Override
protected void onPermissionGranted() {
    android.widget.Toast.makeText(mActivity, "Permission Granted...", Toast.LENGTH_LONG).show();
}