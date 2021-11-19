@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    mCamera.stopPreview();
    mCamera.release();
}