public void robotInit() {
    com.nicoletfear.Stronghold2016.Robot.oi = new com.nicoletfear.Stronghold2016.OI();
    chooser = new edu.wpi.first.wpilibj.smartdashboard.SendableChooser();
    chooser.addDefault("Default Auto", new com.nicoletfear.Stronghold2016.commands.ExampleCommand());
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putData("Auto mode", chooser);
}