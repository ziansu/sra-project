public void initAutonomous() {
    autonomousStartTime = -1;
    autonomousType = org.usfirst.frc.team467.robot.DriverStation2015.getInstance().getAutoType();
    java.lang.System.out.println(("AUTO MODE " + (autonomousType.toString())));
}