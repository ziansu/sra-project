@java.lang.Override
public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
    if (autoHide) {
        delayedHide();
    }
    return false;
}