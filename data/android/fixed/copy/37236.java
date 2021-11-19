private void turnNext() {
    if ((turn) != ((recyclerView.getChildCount()) - 1)) {
        (turn)++;
        setTurned(turn);
    }else {
        turnFirst();
    }
}