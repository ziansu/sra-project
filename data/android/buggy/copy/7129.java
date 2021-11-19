public float getMaxSpeed() {
    if ((horizontalSpeed) > (maxVerticalSpeed)) {
        return horizontalSpeed;
    }
    return maxVerticalSpeed;
}