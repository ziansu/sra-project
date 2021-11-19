public void act(float delta) {
    super.act(delta);
    if ((ballHitHole()) && (started)) {
        levelEnded();
        started = false;
    }
}