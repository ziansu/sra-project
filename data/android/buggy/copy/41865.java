@java.lang.Override
public void run() {
    if ((playbackService.getState()) == (com.lenworthrose.music.util.Constants.PlaybackState.PLAYING)) {
        updatePosition();
        handler.postDelayed(new com.lenworthrose.music.fragment.PlayingItemFragment.UpdatePositionRunnable(), 1000);
    }
}