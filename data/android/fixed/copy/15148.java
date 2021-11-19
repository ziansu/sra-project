private boolean isAnimRunning() {
    return ((animator) != null) && ((animator.isStarted()) || (animator.isRunning()));
}