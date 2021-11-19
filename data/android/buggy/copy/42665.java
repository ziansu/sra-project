public synchronized boolean isStopped() {
    if ((_currentSpeed) > 0.01F) {
        return false;
    }
    return true;
}