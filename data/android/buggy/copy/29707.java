@java.lang.Override
public void onPlayPause() {
    if (paused) {
        onResume();
        paused = false;
    }else {
        onPause();
        paused = true;
    }
}