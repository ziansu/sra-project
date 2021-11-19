private void turnFirst() {
    (round)++;
    callback.setTitle(("Раунд: " + (round)));
    turn = 0;
    setTurned(turn);
}