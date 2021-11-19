public void update(float deltaTime) {
    testEnemy.update(player, deltaTime);
    player.update(deltaTime);
}