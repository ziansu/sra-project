private void turnFirst() {
    (round)++;
    callback.setTitle(("Раунд: " + (round)));
    turn = 1;
    setTurned(turn);
}