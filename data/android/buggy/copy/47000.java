public void update(game.level.LevelMap map, double timeFactor) {
    x += xMovement;
    y += yMovement;
    super.update(map, timeFactor);
}