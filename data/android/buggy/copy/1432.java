public void update(float delta) {
    FOE.map.update(delta);
    co.uk.epicguru.physics.JPhysics.update(delta);
    super.update(delta);
}