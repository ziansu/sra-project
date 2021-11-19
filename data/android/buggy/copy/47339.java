public final void stopAnimation() {
    if ((mAnimation) != null) {
        mAnimation.cancel();
        mAnimation = null;
    }
}