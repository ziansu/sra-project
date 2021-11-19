@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder holder) {
    try {
        mCamera.setPreviewDisplay(holder);
        mCamera.startPreview();
    } catch (java.io.IOException e) {
    }
}