@java.lang.Override
public void runOpMode() throws java.lang.InterruptedException {
    initHardware();
    waitForStart();
    while (opModeIsActive()) {
        org.firstinspires.ftc.teamcode.RevTest.motor1.setPower(1);
        org.firstinspires.ftc.teamcode.Functions.waitFor(3000);
    } 
}