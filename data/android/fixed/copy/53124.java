public double getRotationCompensationAngleBiased() {
    return (isInverted ? -1 : 1) * (org.lasarobotics.vision.util.ScreenOrientation.getFromAngle(((sensors.getScreenOrientationCompensation()) - (unbiasedOrientation.getAngle()))).getAngle());
}