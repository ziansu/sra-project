private void stopCameraPreview() {
    mPreviewing = false;
    mCamera.cancelAutoFocus();
    try {
        mCamera.stopPreview();
    } catch (java.lang.Exception e) {
        android.util.Log.d(app.anish.com.tapp.camera.CameraPreview.TAG, "Tried stopping non-existent preview");
    }
}