public void Right() {
    mAngle += CRobot.INCREMENT;
    if ((java.lang.Math.abs(mAngle)) >= (CRobot.MAX_ANGLE)) {
        mAngle = CRobot.MIN_ANGLE;
    }
    Place(mProperty.x, mProperty.y, mAngle);
}