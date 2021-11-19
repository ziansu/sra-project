@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    super.onAnimationEnd(animation);
    if ((mMainFab.getVisibility()) == (android.view.View.VISIBLE))
        mMainFab.setVisibility(View.INVISIBLE);
    
}