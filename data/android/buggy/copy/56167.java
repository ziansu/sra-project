@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    super.onAnimationEnd(animation);
    android.view.ViewGroup.LayoutParams params = mTabs.getLayoutParams();
    params.height = mToolbar.getHeight();
    mTabs.setLayoutParams(params);
    mLoadingContainer.setVisibility(View.GONE);
}