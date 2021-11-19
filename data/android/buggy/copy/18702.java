@java.lang.Override
public void init() {
    hardware = new org.firstinspires.ftc.team7316.Hardware(hardwareMap);
    gpWrapper = new org.firstinspires.ftc.team7316.util.input.GamepadWrapper(gamepad1);
    leftDrive = new org.firstinspires.ftc.team7316.util.hardware.DcMotorWrapper(hardware.leftDriveMotor, gpWrapper.right_axis_y, false);
    rightDrive = new org.firstinspires.ftc.team7316.util.hardware.DcMotorWrapper(hardware.rightDriveMotor, gpWrapper.left_axis_y, true);
}