@java.lang.Override
public void onBackPressed() {
    if (playing) {
        stopLastSound();
    }
    super.onBackPressed();
}