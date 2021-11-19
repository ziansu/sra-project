@java.lang.Override
public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
    gDetector.onTouchEvent(motionEvent);
    return true;
}