@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    drawer.onAnimationEnd(animation);
    setState(org.codetwisted.widget.DrawerLayout.STATE_IDLE, 0);
}