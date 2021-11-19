private void setPaused(boolean isPaused) {
    _isPaused = isPaused;
    sendAction((_isPaused ? null : org.tequilacat.tcatris.core.GameView.GameAction.UNPAUSE));
}