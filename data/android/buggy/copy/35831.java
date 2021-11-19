public boolean brake(final double brakeSpeed) {
    if (this.transmission.brake(brakeSpeed)) {
        return true;
    }
    return false;
}