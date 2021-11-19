protected void initialize() {
    Robot.solenoidSubsystem.extend();
    edu.wpi.first.wpilibj.Timer.delay(5.0);
    Robot.solenoidSubsystem.retract();
}