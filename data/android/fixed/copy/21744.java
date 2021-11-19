@java.lang.Override
public void autonomousInit() {
    drivetrain.setTalonControlMode(TalonControlMode.Position);
    drivetrain.resetEncoder();
    drivetrain.setPID(1, 0, 0);
    drivetrain.enableControl();
    time.start();
}