private void loadTexture() {
    if ((texture) == null) {
        texture = new com.badlogic.gdx.graphics.Texture(Gdx.files.local(((filePath) + (fileName))));
    }
}