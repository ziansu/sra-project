@java.lang.Override
public void render(com.badlogic.gdx.graphics.g2d.SpriteBatch batch) {
    batch.setProjectionMatrix(camera.combined);
    batch.begin();
    batch.draw(gamemap, 0, 0, Settings.SCREEN_WIDTH, Settings.SCREEN_HEIGHT);
    player.draw(batch);
    batch.end();
}