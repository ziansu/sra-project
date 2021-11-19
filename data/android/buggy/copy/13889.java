@java.lang.Override
public void render() {
    Gdx.gl.glClearColor(r, 0, 0, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    hView.render();
}