private void handleStateLost() {
    levelRenderer.renderLost(currentLevelNumber);
    if (checkForStartKey()) {
        resetController();
        startLevel(1);
    }
}