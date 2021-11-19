@java.lang.Override
public void teleopInit() {
    org.usfirst.frc.team2554.robot.Robot.gyro.calibrate();
    if ((autonomousCommand) != null)
        autonomousCommand.cancel();
    
    myRobot.setSafetyEnabled(false);
}