public void setShape(com.badlogic.gdx.physics.box2d.Shape shape) {
    body.destroyFixture(fixture);
    fixtureDef.shape = shape;
    fixture = body.createFixture(fixtureDef);
}