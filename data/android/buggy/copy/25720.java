public void autonomousInit() {
    org.usfirst.frc.team5190.robot.subsystems.LifecycleSubsystemManager.getInstance().autonomousInit();
    if ((autonomousCommand) != null)
        autonomousCommand.start();
    
    new org.usfirst.frc.team5190.robot.commands.DriveWithLidarCommand().start();
    new org.usfirst.frc.team5190.robot.commands.PutSmartDashBoardCommand().start();
}