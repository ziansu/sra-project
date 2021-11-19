@java.lang.Override
public void hide() {
    Gdx.input.setCursorCatched(false);
    APP.getInputMultiplexer().removeProcessor(Mapper.INPUT.get(PLAYER).PROCESSOR);
    APP.getInputMultiplexer().removeProcessor(DEBUG);
}