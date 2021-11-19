public void clearColor(com.nilunder.bdx.utils.Color color) {
    com.nilunder.bdx.Bdx.clearColor.set(color);
    Gdx.gl.glClearColor(color.r, color.g, color.b, color.a);
}