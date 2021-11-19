private static double gallonPerMileForTruckVeh(double speed) {
    double y = 0;
    y = java.lang.Math.pow((1.0662 * speed), (-0.483));
    return y;
}