@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent ev) {
    return (gestureDetector.onTouchEvent(ev)) || (super.onTouchEvent(ev));
}