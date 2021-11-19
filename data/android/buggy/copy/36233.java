public double xAngularSpeed() {
    double[] speed = frc.team4215.stronghold.I2CGyro.getAngSpeed();
    return speed[1];
}