@java.lang.Override
public boolean dispatchTouchEvent(android.view.MotionEvent ev) {
    if (!(super.dispatchTouchEvent(ev)))
        mGestureDetector.onTouchEvent(ev);
    
    return true;
}