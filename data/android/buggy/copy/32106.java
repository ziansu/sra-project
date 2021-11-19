@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    event.offsetLocation(offsetX, offsetY);
    controller.touched(event);
    invalidate();
    return true;
}