public void pause() {
    if ((exoPlayer) != null) {
        exoPlayer.setPlayWhenReady(false);
    }else
        if ((mediaPlayer) != null) {
            mediaPlayer.pause();
        }
    
}