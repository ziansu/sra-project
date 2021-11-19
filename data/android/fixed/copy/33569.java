@java.lang.Override
public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int width, int height) {
    mediaPlayer.setSurface(new android.view.Surface(surfaceTexture));
    if (playRequested) {
        start();
    }
}