@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    drawer.onAnimationEnd(animation);
    state = org.codetwisted.widget.DrawerLayout.STATE_IDLE;
}