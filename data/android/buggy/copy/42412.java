public void updateAngle(float radAngleToNorth) {
    angleToRotate = ((int) ((((-1) * radAngleToNorth) * 180) / (java.lang.Math.PI)));
    invalidate();
}