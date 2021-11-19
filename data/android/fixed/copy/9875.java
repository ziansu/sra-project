public void setActive() {
    activeTrajectory = defaultTrajectory;
    nextTrajectory = defaultTrajectory;
    resetPID();
    isActive = true;
}