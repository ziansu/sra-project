@android.annotation.TargetApi(value = 11)
private void setUpCameraGingerbread(final android.hardware.Camera camera) {
    try {
        mRenderer.setUpSurfaceTexture(camera);
        camera.setPreviewTexture(new android.graphics.SurfaceTexture(0));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}