@java.lang.Override
public void testPeriodic() {
    edu.wpi.first.wpilibj.livewindow.LiveWindow.run();
    testingGroup.start();
    java.lang.System.out.println(("Drive stick magnitude: " + (RobotMap.driverController.getMagnitude())));
    java.lang.System.out.println(("Drive direction in degrees: " + (RobotMap.driverController.getDirectionDegrees())));
}