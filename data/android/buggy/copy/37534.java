public void hideEventMessage() {
    eventMessageOverlayVisible = false;
    if (upgradeOverlayVisible) {
        Gdx.input.setInputProcessor(upgradeOverlay);
    }else {
        Gdx.input.setInputProcessor(gameStage);
    }
}