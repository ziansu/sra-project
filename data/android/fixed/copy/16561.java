protected void handleStatePause() {
    levelRenderer.renderPause();
    if (checkForStartKey()) {
        state = sem.group15.bubblebobble.core.GameController.GameState.PLAY;
    }
}