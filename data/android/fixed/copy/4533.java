public void updateBestReward(double newBest, logist.topology.Topology.City newBestAction) {
    pre_bestReward = bestReward;
    bestReward = newBest;
    bestAction = newBestAction;
}