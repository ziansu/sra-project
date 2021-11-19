protected double getThrottle() {
    return ((-(joystick.getRawAxis(3))) + 1) / 2;
}