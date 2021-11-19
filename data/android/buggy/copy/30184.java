@java.lang.Override
public void teleopPeriodic() {
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().run();
    if ((org.usfirst.frc.team5427.robot.Robot.ultrasonic) != null) {
        edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("Ultrasonic Sensor (in):", org.usfirst.frc.team5427.robot.Robot.ultrasonic.getRangeInches());
        Voltage = $missing$;
    }
}