private void stopAnim() {
    if ((valueAnimator) != null) {
        clearAnimation();
        valueAnimator.setRepeatCount(0);
        valueAnimator.cancel();
        mAmAnimatedPackValue = 0.0F;
        mAnimatedBgValue = 0.0F;
        postInvalidate();
    }
}