public void teleopPeriodic() {
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().run();
    AustinTriggerStrafe();
    robot.tankDrive(org.usfirst.frc.team5243.robot.Robot.oi.getLeftStick(), org.usfirst.frc.team5243.robot.Robot.oi.getRightStick());
}