@java.lang.Override
public void render() {
    Gdx.gl20.glClearColor(0, 0, 0, 1);
    Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
    renderer.render(world, camera.combined);
    this.renderGameObjects();
    ray_handler.updateAndRender();
}