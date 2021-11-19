@java.lang.Override
public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int width, int height) {
    if ((videoRenderer) != null)
        player.sendMessage(videoRenderer, MediaCodecVideoTrackRenderer.MSG_SET_SURFACE, new android.view.Surface(surface));
    
}