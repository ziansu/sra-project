@java.lang.Override
public void show() {
    Gdx.input.setInputProcessor(stage);
    createDefaultSkin();
    loadBackground();
    buttonSetup();
}