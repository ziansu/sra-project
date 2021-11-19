private void calculateAngularPositionOfPin() {
    pinAngularPosition = (((currentScore) * (degreesPerPoint)) % 360.0F) - 90.0F;
}