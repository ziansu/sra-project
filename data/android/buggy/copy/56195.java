public boolean armIsAtDistance(double distance) {
    return (java.lang.Math.abs(((getRightEncoderDistance()) - distance))) <= 0.1 ? true : false;
}