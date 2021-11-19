private void beginRenderMode(com.katzstudio.kreativity.ui.render.KrRenderer.RenderMode renderMode) {
    switch (renderMode) {
        case SPRITE_BATCH :
            spriteBatch.begin();
            break;
        case SHAPE :
            shapeRenderer.begin();
            break;
    }
}