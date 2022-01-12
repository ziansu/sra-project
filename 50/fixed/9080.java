public void start() {
    if ((exoPlayer) != null) {
        exoPlayer.setPlayWhenReady(true);
    }else
        if ((mediaPlayer) != null) {
            mediaPlayer.start();
        }
    
}