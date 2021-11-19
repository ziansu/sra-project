@java.lang.Override
public void onAnimationEnd(android.animation.Animator animator) {
    try {
        mWindowManager.removeViewImmediate(mLayout);
    } catch (java.lang.Exception e) {
    }
}