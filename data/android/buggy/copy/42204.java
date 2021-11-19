@java.lang.Override
public void onPaused() {
    mPlayPause.setDisplayedChild(1);
    mPlaylist.pause();
}