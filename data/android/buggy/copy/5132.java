public void onPause() {
    mSurfaceTexture = null;
    if ((mCamera) != null) {
        mCamera.stopPreview();
        mCamera.release();
        mCamera = null;
    }
}