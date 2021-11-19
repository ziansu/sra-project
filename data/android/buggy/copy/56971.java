public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    if ((mCamera) != null) {
        mCamera.stopPreview();
        mCamera.release();
    }
}