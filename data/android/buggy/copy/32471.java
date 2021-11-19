private double deadband(double val) {
    if ((java.lang.Math.abs(val)) >= (org.usfirst.frc.team3164.lib.baseComponents.sensors.Accel1Test.ACCEL_DEADBAND_THRESHOLD)) {
        return 0;
    }
    return val;
}