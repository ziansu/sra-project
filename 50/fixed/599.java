@java.lang.Override
public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
    if ((resClient) != null) {
        resClient.stopPreview();
    }
    return false;
}