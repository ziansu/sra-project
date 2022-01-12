@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    performDismiss(downView, downPosition);
    mCallbacks.onViewSwiped(downPosition);
}