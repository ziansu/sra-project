@java.lang.Override
public void onStopTrackingTouch(int progress) {
    if ((playBinder) != null) {
        playBinder.onStopTrackingTouch(progress);
    }
}