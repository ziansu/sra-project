public synchronized boolean isStopped() {
    return (_currentSpeed) <= 0.01F;
}