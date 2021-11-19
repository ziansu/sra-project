public void finishMyTurn() {
    synchronized(isRedPlayerTurn) {
        isRedPlayerTurn = !(isRedPlayerTurn);
    }
}