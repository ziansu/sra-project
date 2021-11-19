public void initializeCoMPositionToActual(javax.vecmath.Tuple3d initialCoMPosition) {
    initializeToActual = true;
    centerOfMassPosition.setIncludingFrame(us.ihmc.stateEstimation.humanoid.kinematicsBasedStateEstimation.PelvisLinearStateUpdater.worldFrame, initialCoMPosition);
    yoCenterOfMassPosition.set(initialCoMPosition);
}