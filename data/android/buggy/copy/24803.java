public void draw(com.badlogic.gdx.graphics.g2d.SpriteBatch batch) {
    batch.draw(fov, 0, 0);
    player.draw(batch);
    java.lang.System.out.println((((player.drawPosX) + ", ") + (player.drawPosY)));
}