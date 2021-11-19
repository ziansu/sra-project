@java.lang.Override
public boolean onInterceptTouchEvent(android.view.MotionEvent ev) {
    try {
        return super.onInterceptTouchEvent(ev);
    } catch (java.lang.IllegalArgumentException e) {
        e.printStackTrace();
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        e.printStackTrace();
    }
    return false;
}