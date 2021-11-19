@java.lang.Override
public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int width, int height) {
    surface = new android.view.Surface(surfaceTexture);
    mediaPlayer.setSurface(surface);
    if (playRequested) {
        start();
    }
}