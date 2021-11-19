private void cancelPreRipple() {
    if ((fastRippleAnimator) != null) {
        fastRippleAnimator.cancel();
        fastRippleAnimator = null;
    }
}