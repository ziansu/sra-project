public int updateBet(int addedBet) {
    if ((betTracker) < (stakeTracker)) {
        betTracker = addedBet + (betTracker);
        return betTracker;
    }else {
        betTracker = stakeTracker;
        return betTracker;
    }
}