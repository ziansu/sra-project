@java.lang.Override
public void pause() {
    mService.pauseMediaPlayer();
    setController();
    playbackPaused = true;
}