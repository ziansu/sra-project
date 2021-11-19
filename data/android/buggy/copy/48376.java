private void updateValues() {
    angles = imu.getAngularOrientation().toAxesReference(AxesReference.INTRINSIC).toAxesOrder(AxesOrder.ZYX);
    acceleration = imu.getAcceleration().toUnit(DistanceUnit.METER);
}