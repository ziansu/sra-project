@java.lang.Override
public void onPause() {
    divyang.musicapp_v6.BackgroundMediaService.mediaPlayer.pause();
    setMediaPlaybackState(PlaybackState.STATE_PAUSED);
    stopForeground(false);
    showPausedNotification();
    super.onPause();
}