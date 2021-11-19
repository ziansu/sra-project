public void setRightSpeed(double speed) {
    rightMotor1.set(((-speed) * (org.usfirst.frc.team5677.robot.subsystems.DriveTrain.RIGHT_SCALE)));
    rightMotor2.set(((-speed) * (org.usfirst.frc.team5677.robot.subsystems.DriveTrain.RIGHT_SCALE)));
}