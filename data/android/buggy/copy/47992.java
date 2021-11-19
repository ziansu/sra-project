@java.lang.Override
public void onAnimationStart(android.view.animation.Animation animation) {
    if (fromHeight == 0)
        view.setVisibility(View.VISIBLE);
    
}