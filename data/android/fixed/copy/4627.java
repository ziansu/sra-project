@java.lang.Override
public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int width, int height) {
    setSize(width, height);
    dispatchSurfaceChanged();
}