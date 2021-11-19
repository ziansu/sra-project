private void updateControllers(float delta) {
    playerController.update(delta, gameState);
    projectileController.update(delta, gameState);
}