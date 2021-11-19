@java.lang.Override
public boolean onInterceptTouchEvent(android.view.MotionEvent ev) {
    dispatchJSTouchEvent(ev);
    return super.onInterceptTouchEvent(ev);
}