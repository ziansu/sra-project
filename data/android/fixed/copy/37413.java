public int updateStake() {
    stakeTracker = (stakeTracker) - (getBet());
    return stakeTracker;
}