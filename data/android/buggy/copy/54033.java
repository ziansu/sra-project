public void render(com.badlogic.gdx.graphics.g2d.Batch spriteBatch) {
    spriteBatch.begin();
    spriteRenderSystem.render(spriteBatch);
    shapeRenderSystem.render(spriteBatch);
    textRenderSystem.render(spriteBatch);
    consoleHighlightRenderSystem.render(spriteBatch);
    spriteBatch.end();
}