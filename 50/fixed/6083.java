protected boolean isSpeedMaybeRiding(float speedKmh) {
    return ((this.isSpeedForSureNotRiding(speedKmh)) == false) && ((this.isSpeedForSureRiding(speedKmh)) == false);
}