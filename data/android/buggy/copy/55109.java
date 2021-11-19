private void endRenderMode(com.katzstudio.kreativity.ui.render.KrRenderer.RenderMode renderMode) {
    switch (renderMode) {
        case SPRITE_BATCH :
            spriteBatch.end();
            break;
        case SHAPE :
            shapeRenderer.end();
            break;
    }
    this.renderMode = com.katzstudio.kreativity.ui.render.KrRenderer.RenderMode.NONE;
}