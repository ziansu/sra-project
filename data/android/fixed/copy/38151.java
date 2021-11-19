public boolean checkCameraHardware(android.content.Context context) {
    return context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA);
}