@java.lang.Override
public void pause() {
    mService.pauseMediaPlayer();
    playbackPaused = true;
}