@java.lang.Override
public void preSolve(com.superduckinvaders.game.entity.PhysicsEntity other, com.badlogic.gdx.physics.box2d.Contact contact, com.badlogic.gdx.physics.box2d.Manifold manifold) {
    if (DuckGame.session.noHitboxCheat) {
        contact.setEnabled(false);
    }
}