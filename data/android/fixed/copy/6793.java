public void Stg1RPMUp() {
    if ((_stg1MtrTargetRPM) > (org.usfirst.frc.team4028.robot.subsystems.Shooter.MAX_SHOOTER_RPM)) {
        if ((_stg1MtrTargetRPM) < 0) {
            SpinStg1Wheel((_stg1MtrTargetRPM -= 100));
        }else {
            SpinStg1Wheel((-3000));
        }
    }
}