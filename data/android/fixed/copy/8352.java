private boolean isDeviceSupportCamera() {
    return getApplicationContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA);
}