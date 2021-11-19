public double[] getRobotAttitude() {
    org.firstinspires.ftc.robotcore.external.navigation.Orientation angles = imu.getAngularOrientation(AxesReference.INTRINSIC, AxesOrder.ZYX, AngleUnit.RADIANS);
    double[] out = new double[]{ angles.firstAngle , 0.0 , 0.0 };
    return out;
}