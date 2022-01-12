public float getMaxSpeed() {
    if ((java.lang.Math.abs(horizontalSpeed)) > (java.lang.Math.abs(maxVerticalSpeed))) {
        return java.lang.Math.abs(horizontalSpeed);
    }
    return java.lang.Math.abs(maxVerticalSpeed);
}