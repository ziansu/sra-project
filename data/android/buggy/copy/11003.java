private void stopPreviewAndFreeCamera() {
    if ((mCamera) != null) {
        mCamera.stopPreview();
        mCamera.release();
        mCamera = null;
    }
    java.lang.System.out.println("Camera Stopped and Freed!!!");
}