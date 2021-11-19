public void removeAllCallbacks() {
    mHandlerFocus.removeCallbacks(mLostFocusChecker);
    mHandlerAnimation.postDelayed(mLostFocusChecker, 50);
    mHandlerAnimation.removeCallbacks(mDoneDeblurAnimationChecker);
    mHandlerAnimation.postDelayed(mDoneDeblurAnimationChecker, 50);
}