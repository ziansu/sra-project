void updateCamera() {
    camera.position.set(((int) (player.getX())), ((int) (player.getY())), 0.0F);
    camera.update();
}