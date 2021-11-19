@java.lang.Override
protected void onSaveInstanceState(@android.support.annotation.NonNull
android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if (player.isPlaying()) {
        outState.putInt("video-position", player.getCurrentPosition());
    }
}