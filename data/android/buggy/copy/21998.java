@java.lang.Override
public boolean onInterceptTouchEvent(android.view.MotionEvent ev) {
    if (isSlide) {
        return true;
    }else {
        return super.onInterceptTouchEvent(ev);
    }
}