@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if ((videoView) != null) {
        stopPosition = videoView.getCurrentPosition();
        videoView.pause();
        outState.putInt("position", stopPosition);
    }
}