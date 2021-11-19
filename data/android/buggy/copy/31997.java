public double xAngle() {
    double[] angles = frc.team4215.stronghold.I2CGyro.getAngles();
    return angles[0];
}