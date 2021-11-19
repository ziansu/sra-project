public void robotInit() {
    org.usfirst.frc.team4564.robot.Common.debug("error?");
    dt = new org.usfirst.frc.team4564.robot.DriveTrain();
    org.usfirst.frc.team4564.robot.Robot.table = edu.wpi.first.wpilibj.networktables.NetworkTable.getTable("dashTable");
    org.usfirst.frc.team4564.robot.Common.debug("hello");
}