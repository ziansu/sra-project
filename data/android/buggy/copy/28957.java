public void robotInit() {
    org.usfirst.frc.team6179.robot.Robot.instance = this;
    oi = new org.usfirst.frc.team6179.robot.LogitechGamepad();
    chooser = new edu.wpi.first.wpilibj.smartdashboard.SendableChooser();
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putData("Auto mode", chooser);
    shooter = new org.usfirst.frc.team6179.robot.subsystems.Shooter();
    elevator = new org.usfirst.frc.team6179.robot.subsystems.ShooterElevator();
}