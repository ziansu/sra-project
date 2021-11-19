public void figureOutDistribution() {
    if ((team316.utils.Turn.currentTurn()) == 0) {
        buildDistribution.clear();
        buildDistribution.put(RobotType.SOLDIER, 100.0);
    }
}