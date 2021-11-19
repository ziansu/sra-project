@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation paramAnimation) {
    hideViews();
    mIsShowing = false;
    onDismissed();
    mParent.setShowingDialog(false);
}