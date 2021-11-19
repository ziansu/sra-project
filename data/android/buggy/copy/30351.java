public void stop() {
    mAnimator.setIgnoreExceptions(true);
    mAnimator.pause();
    mAnimator.stop();
    while (mAnimator.isAnimating())
        java.lang.Thread.yield();
    
}