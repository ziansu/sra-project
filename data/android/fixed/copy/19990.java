@java.lang.Override
public void onFileContentChanged() {
    releasePlayer();
    preparePlayer();
    if ((player) != null) {
        mPlaybackPosition = 0;
        player.setPlayWhenReady(mAutoplay);
    }
}