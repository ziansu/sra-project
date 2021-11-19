public boolean checkTransitionAnimation() {
    if ((transitionAnimationInProgress) && ((transitionAnimationStartTime) < ((java.lang.System.currentTimeMillis()) - 1500))) {
        onAnimationEndCheck(true);
    }
    return transitionAnimationInProgress;
}