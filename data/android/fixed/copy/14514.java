private void openCamera(int id) {
    mCamera = android.hardware.Camera.open(id);
    if (((Build.VERSION.SDK_INT) > (Build.VERSION_CODES.JELLY_BEAN_MR1)) && ((mCamera) != null)) {
        mCamera.enableShutterSound(false);
    }
}