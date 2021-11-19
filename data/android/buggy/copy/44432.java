@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    setState(com.lsxiao.library.DraggableLayout.State.IDLE);
    invalidate();
    showDotView();
    mTouchedDot = null;
}