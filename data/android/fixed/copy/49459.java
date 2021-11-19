@java.lang.Override
public void runOpMode() throws java.lang.InterruptedException {
    robot.initialize(hardwareMap);
    waitForStart();
    robot.colorSensor.red();
    robot.colorSensor.blue();
    selectJewel(robot, red);
}