private void stopPreview() {
    if ((this.mCamera) != null) {
        this.mCamera.stopPreview();
        this.mCamera.release();
    }
    this.mCamera = null;
    this.mPreviewRunning = false;
}