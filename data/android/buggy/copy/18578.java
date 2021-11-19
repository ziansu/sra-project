public void setLaneTransitionMax(int laneSize) {
    velocityResetMax = laneSize - (laneSize % (abyssproductions.double0driver.GameGlobals.getInstance().getImageResources().getInteger(R.integer.PlayerHorVelocity)));
}