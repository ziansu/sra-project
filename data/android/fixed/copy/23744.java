@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    if ((gestureDetector) != null) {
        gestureDetector.onTouchEvent(event);
    }
    return super.onTouchEvent(event);
}