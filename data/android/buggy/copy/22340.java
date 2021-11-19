@java.lang.Override
public boolean onDoubleTap(android.view.MotionEvent event) {
    skyMapRenderer.handleDoubleTap(event);
    return true;
}