public static int degreeToTick(double degrees) {
    return ((int) (java.lang.Math.round(((java.lang.Math.abs(degrees)) * (org.usfirst.frc.team4161.robot.ConversionFactor.ticksToDegree)))));
}