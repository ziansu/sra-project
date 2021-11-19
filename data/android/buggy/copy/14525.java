public void endContact(com.badlogic.gdx.physics.box2d.Contact c) {
    fa = c.getFixtureA();
    fb = c.getFixtureB();
}