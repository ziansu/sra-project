public void endTurnClock(int num) {
    long end = java.time.Instant.now().getEpochSecond();
    players[num].setAvgTimeOfTurn((end - (startTurnTime)));
}