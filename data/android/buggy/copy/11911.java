public void stopGame() {
    for (core.GameEventListener listener : listeners) {
        listener.gameOver();
    }
    currentThread.interrupt();
}