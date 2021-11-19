@java.lang.Override
public void render(float delta) {
    super.render(delta);
    snake.render();
    gameUI.render();
    food.render();
    if (isPaused)
        gameUI.renderPause();
    
}