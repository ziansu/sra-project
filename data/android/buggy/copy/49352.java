public void draw(com.badlogic.gdx.graphics.g2d.SpriteBatch spriteBatch, com.badlogic.gdx.graphics.Camera camera, boolean debug) {
    getCamera().update();
    super.root.draw(spriteBatch, 1.0F);
}