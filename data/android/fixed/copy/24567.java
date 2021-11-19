@java.lang.Override
public void render(float delta) {
    super.render(delta);
    gameUI.render();
    snake.render();
    food.render();
    if (isPaused)
        gameUI.renderPause();
    
}