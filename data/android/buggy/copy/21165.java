public void render(com.badlogic.gdx.graphics.g2d.SpriteBatch batch) {
    batch.begin();
    mainContainer.renderBackground(batch);
    batch.end();
    batch.begin();
    mainContainer.render(batch);
    batch.end();
}