public void startAiming() {
    state = GameState.AIMING;
    camera.position.x = gameMap.ship.pos.x;
    camera.position.y = gameMap.ship.pos.y;
    camera.zoom = 1.0F;
    clampCamera();
}