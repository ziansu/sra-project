@java.lang.Override
public boolean onSingleTapConfirmed(android.view.MotionEvent e) {
    return (onTap(e.getRawX(), e.getRawY())) || (super.onSingleTapConfirmed(e));
}