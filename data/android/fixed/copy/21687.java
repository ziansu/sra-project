protected void fullscreenChanged(boolean fullscreen) {
    for (com.roryhool.videoinfoviewer.views.VideoPlayerView.OnFullscreenListener listener : mFullscreenListeners) {
        if (listener != null) {
            listener.onFullscreenChanged(fullscreen);
        }
    }
}