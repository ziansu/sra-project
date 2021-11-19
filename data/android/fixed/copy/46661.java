@java.lang.Override
public boolean handleUpOrCancelTouchEvent(android.view.MotionEvent event) {
    issueStateTransition(mBounceBackState);
    return false;
}