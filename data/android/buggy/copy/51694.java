public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    Main.manager.get("rewind.wav", com.badlogic.gdx.audio.Sound.class).play();
    thepaperpilot.strange.Main.changeScreen(previousScreen);
}