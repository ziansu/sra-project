@java.lang.Override
public void render(com.badlogic.gdx.graphics.g2d.SpriteBatch batch) {
    batch.setProjectionMatrix(camera.combined);
    batch.begin();
    gamemap.draw(batch);
    player.draw(batch);
    batch.end();
}