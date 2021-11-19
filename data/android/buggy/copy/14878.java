@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    stopPosition = videoView.getCurrentPosition();
    videoView.pause();
    outState.putInt("position", stopPosition);
}