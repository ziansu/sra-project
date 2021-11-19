public void recruit() {
    turn.getState().pull(turn);
    notifyObservers();
}