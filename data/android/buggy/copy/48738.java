@java.lang.Override
public void dispose() {
    Gdx.app.debug(com.lothbrok.game.screens.MainMenuScreen.TAG, "dispose");
    stage.dispose();
    super.dispose();
}