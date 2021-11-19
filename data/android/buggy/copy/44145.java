private boolean isSpeedMaybeRiding(float speedKmh) {
    return ((this.isSpeedForSureNotRiding()) == false) && ((this.isSpeedForSureRiding()) == false);
}