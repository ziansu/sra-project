public void arcadeDrive(double moveValue, double rotateValue) {
    drive.arcadeDrive(((-moveValue) * (org.usfirst.frc.team3019.robot.RobotMap.DRIVE_NERF)), (rotateValue * (org.usfirst.frc.team3019.robot.RobotMap.TURN_NERF)));
}