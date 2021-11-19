public void endTurnClock() {
    long end = java.time.Instant.now().getEpochSecond();
    players[numOfPlayer].setAvgTimeOfTurn((end - (startTurnTime)));
}