@java.lang.Override
public void onPause() {
    super.onPause();
    nowPlaying.setAnimated(false);
    mediaPlayer.pause();
    listener.songPause();
    audioManager.abandonAudioFocus(onAudioFocusChangeListener);
    launchNotification(false);
    setMediaSessionState();
}