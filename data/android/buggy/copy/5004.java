public boolean isPlaying() {
    if ((exoPlayer) != null) {
        return exoPlayer.getPlayWhenReady();
    }else {
        return mediaPlayer.isPlaying();
    }
}