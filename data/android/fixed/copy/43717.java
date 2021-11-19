public void Stg1RPMDown() {
    if ((_stg1MtrTargetRPM) < (org.usfirst.frc.team4028.robot.subsystems.Shooter.MIN_SHOOTER_RPM)) {
        SpinStg1Wheel((_stg1MtrTargetRPM += 100));
    }
}