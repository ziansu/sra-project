public void unpause() {
    Gdx.graphics.setContinuousRendering(true);
    game.game.paused = false;
    hint.setVisible(false);
}