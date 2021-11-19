void updateCamera() {
    camera.position.set(player.getX(), ((player.getY()) + 0.5F), 0.0F);
    camera.update();
}