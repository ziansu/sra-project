@java.lang.Override
protected void onResume() {
    super.onResume();
    if (mAskPermissionForLocation) {
        askPermissionForLocation();
    }
}