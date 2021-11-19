@java.lang.Override
protected void initDefaultCommand() {
    setDefaultCommand(new org.usfirst.frc.team6179.robot.commands.vision.SendVideoWithCrosshair(Robot.instance.shooterVision));
}