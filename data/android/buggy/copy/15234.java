public void nextTurn() {
    if ((turnPlayer) < (randomList.size())) {
        (turnPlayer)++;
    }else {
        turnPlayer = 0;
    }
}