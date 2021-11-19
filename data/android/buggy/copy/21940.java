public void renderObjects() {
    batch.enableBlending();
    batch.begin();
    renderSpot();
    renderObstacles();
    batch.end();
}