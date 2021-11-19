@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    if ((mOnImageViewListener) == null) {
        return super.onTouchEvent(event);
    }
    return (mOnImageViewListener.onTouchEvent(event)) || (super.onTouchEvent(event));
}