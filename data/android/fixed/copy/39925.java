public void onFinish() {
    de.lin_engel.robopongcontroller.model.RangeType angle = new de.lin_engel.robopongcontroller.model.RangeType(("" + ((int) (mLastAngleValue))));
    mRoboterHelper.sendAngleCommand(angle);
}