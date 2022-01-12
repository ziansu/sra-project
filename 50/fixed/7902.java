public void event() {
    try {
        zeroGyro();
    } catch (java.io.IOException e) {
        ccre.log.Logger.warning("Could not initiate gyro zeroing", e);
    }
}