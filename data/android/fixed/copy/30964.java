public void unpause() {
    game.game.paused = false;
    hint.setVisible(false);
    Gdx.graphics.setContinuousRendering(true);
}