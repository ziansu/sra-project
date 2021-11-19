@java.lang.Override
public boolean onFling(android.view.MotionEvent e1, android.view.MotionEvent e2, float velocityX, float velocityY) {
    mFlingShow = (java.lang.Math.abs(velocityX)) >= (mFlingVelocity);
    return false;
}