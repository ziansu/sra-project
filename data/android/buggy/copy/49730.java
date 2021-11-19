public void finishMyTurn() {
    final boolean redTurn = isRedPlayerTurn.get();
    isRedPlayerTurn.set((!redTurn));
}