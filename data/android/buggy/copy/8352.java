private boolean isDeviceSupportCamera() {
    if (getApplicationContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)) {
        return true;
    }else {
        return false;
    }
}