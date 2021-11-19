@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if ((mExoPlayer) != null) {
        outState.putLong("bufferPosition", mExoPlayer.getCurrentPosition());
    }
}