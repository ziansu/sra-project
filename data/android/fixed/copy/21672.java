private void stopPreview() {
    if ((this.mCamera) != null) {
        this.mCamera.stopPreview();
    }
    this.mPreviewRunning = false;
}