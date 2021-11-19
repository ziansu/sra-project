@java.lang.Override
public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    com.kleinsamuel.game.util.DebugMessageFactory.printInfoMessage(("CLICKED: " + (game.CONNECTED)));
    if (game.CONNECTED) {
        onlineStatusLabel.clear();
        game.setScreen(signUpScreen);
    }
}