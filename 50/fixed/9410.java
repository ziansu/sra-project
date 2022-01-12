private boolean sleepSilently(long _sleepTime) {
    try {
        java.lang.Thread.sleep(_sleepTime);
    } catch (java.lang.InterruptedException _e) {
        return false;
    }
    return true;
}