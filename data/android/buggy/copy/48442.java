@java.lang.Override
public void onVideoViewClicked() {
    if ((mediaPlayer) != null) {
        if (!(paused)) {
            mediaPlayer.pause();
            paused = !(paused);
        }else {
            mediaPlayer.release();
        }
    }
}