public void advanceStep(int steps) {
    step += steps;
    turn = (steps % (playerCount)) + 1;
}