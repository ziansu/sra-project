@java.lang.Override
public boolean onSingleTapConfirmed(android.view.MotionEvent e) {
    listener.get().onTapped();
    return false;
}