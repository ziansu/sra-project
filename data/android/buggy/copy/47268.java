@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    if (onAnimationEnd != null) {
        onAnimationEnd.run();
    }
}