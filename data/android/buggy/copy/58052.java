@java.lang.Override
public boolean onSingleTapConfirmed(android.view.MotionEvent e) {
    java.lang.System.out.println("CaptureGestureListener");
    return (onTap(e.getRawX(), e.getRawY())) || (super.onSingleTapConfirmed(e));
}