private void openTradeOverlay() {
    tradeOverlayVisible = true;
    Gdx.input.setInputProcessor(tradeOverlay);
}