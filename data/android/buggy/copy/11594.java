public void stopCamera() {
    disableEncoding();
    if ((mCamera) != null) {
        mCamera.stopPreview();
        mCamera.release();
        mCamera = null;
    }
}