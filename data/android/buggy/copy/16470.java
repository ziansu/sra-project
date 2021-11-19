public void teleopPeriodic() {
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().run();
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putData(edu.wpi.first.wpilibj.command.Scheduler.getInstance());
    OI.zeroEncoder.whenPressed(new org.usfirst.frc.team2345.robot.commands.zeroEncoders());
}