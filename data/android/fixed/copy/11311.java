public void hitObstacle(boolean top) {
    vel[0] = 0;
    if ((vel[1]) > 0) {
        vel[1] = 0;
    }
    if (top) {
        hitGround();
    }
}