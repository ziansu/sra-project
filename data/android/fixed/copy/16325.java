public com.mommoo.animation.Animator stop() {
    if (((animatorTimer) != null) && (animatorTimer.isRunning())) {
        animationListener.onStop();
        animatorTimer.stop();
    }
    return this;
}