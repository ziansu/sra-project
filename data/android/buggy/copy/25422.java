public void Right() {
    mAngle = -(CRobot.INCREMENT);
    if ((mAngle) < (CRobot.MIN_ANGLE)) {
        mAngle = CRobot.MAX_ANGLE;
    }
    Place(mProperty.x, mProperty.y, mAngle);
}