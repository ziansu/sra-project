@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent ev) {
    return (((gestureDetector) != null) && (gestureDetector.onTouchEvent(ev))) || (super.onTouchEvent(ev));
}