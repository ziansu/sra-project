private void releaseCamera() {
    if ((mCamera) != null) {
        mCamera.stopPreview();
        mCamera.release();
        mCamera = null;
        android.util.Log.d(TAG, "releaseCamera -- done");
    }
}