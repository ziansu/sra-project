public boolean isDeviceSupportCamera() {
    return this.context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA);
}