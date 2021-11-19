public void act(boolean enemy) {
    if (isOffScreen()) {
        respawn(enemy);
    }else {
        move();
    }
}