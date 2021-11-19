public com.mommoo.animation.Animator stop() {
    if (((animatorTimer) != null) && (animatorTimer.isRunning())) {
        animatorTimer.stop();
        animationListener.onStop();
    }
    return this;
}