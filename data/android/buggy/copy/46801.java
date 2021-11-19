private void cancelPreRipple() {
    if ((slowRippleAnimator) != null) {
        slowRippleAnimator.cancel();
    }
    if ((fastRippleAnimator) != null) {
        fastRippleAnimator.cancel();
        fastRippleAnimator.removeAllListeners();
    }
}