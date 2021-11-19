private boolean isAnimRunning() {
    if (((animator) != null) && ((animator.isStarted()) || (animator.isRunning()))) {
        return true;
    }
    return false;
}