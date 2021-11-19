public void update(float delta) {
    if (!(logicPaused))
        debugInput();
    
    viewport.apply();
    gameCamera.update();
    engine.update(delta);
}