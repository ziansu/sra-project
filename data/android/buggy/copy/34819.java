@java.lang.Override
public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    newScreen = true;
    game.setScreen(new com.mygdx.game.Screens.StartMenuScreen(((com.mygdx.game.MiniMiner) (game))));
}