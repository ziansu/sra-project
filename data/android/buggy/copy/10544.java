public void closeTradeOverlay() {
    tradeOverlayVisible = false;
    engine.removeTrade(currentTrade);
    Gdx.input.setInputProcessor(gameStage);
}