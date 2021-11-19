public void Left() {
    mAngle -= CRobot.INCREMENT;
    if ((java.lang.Math.abs(mAngle)) < (CRobot.MIN_ANGLE)) {
        mAngle = CRobot.MAX_ANGLE;
    }
    Place(mProperty.x, mProperty.y, mAngle);
}