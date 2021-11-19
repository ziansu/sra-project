@java.lang.Override
public void show() {
    Gdx.input.setCursorCatched(true);
    Gdx.input.setInputProcessor(world.player.controller);
    world.music(true);
}