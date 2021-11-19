@java.lang.Override
protected void onPermissionGranted() {
    android.widget.Toast.makeText(getActivity(), "Permission Granted...", Toast.LENGTH_LONG).show();
}