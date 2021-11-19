public void pause() {
    if ((exoPlayer) != null) {
        exoPlayer.setPlayWhenReady(false);
    }else {
        mediaPlayer.pause();
    }
}