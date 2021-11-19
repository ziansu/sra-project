public int getCurrentRoll() {
    currentRoll = (diceRoll.nextInt(6)) + 1;
    return currentRoll;
}