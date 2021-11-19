public synchronized boolean isAtSpeed() {
    return (java.lang.Math.abs(((_currentSpeed) - (_targetSpeed)))) <= 0.01;
}