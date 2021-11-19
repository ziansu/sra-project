public void stopPlayback() {
    if (!(useExo)) {
        mediaPlayer.stop();
    }else {
        emExoPlayer.stop();
    }
    stopProgressPoll();
}