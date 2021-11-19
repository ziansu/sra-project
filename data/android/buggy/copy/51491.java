public void changeLinearVelocity(final com.badlogic.gdx.math.Vector2 newVelocity) {
    body.applyLinearImpulse(newVelocity.sub(body.getLinearVelocity()).scl(body.getMass()), body.getPosition(), true);
}