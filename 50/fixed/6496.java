@java.lang.Override
public org.catrobat.catroid.content.bricks.Brick clone() {
    return new org.catrobat.catroid.content.bricks.LegoEv3MotorMoveBrick(motorEnum, getFormulaWithBrickField(BrickField.LEGO_EV3_POWER).clone(), getFormulaWithBrickField(BrickField.LEGO_EV3_PERIOD_IN_SECONDS).clone());
}