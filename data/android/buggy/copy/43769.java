@java.lang.Override
public void create() {
    game = this;
    incanshift.world.GameSettings.MUSIC_VOLUME = 0;
    incanshift.world.GameSettings.SOUND_VOLUME = 0;
    startScreen = new incanshift.screen.StartScreen(game, reqWidth, reqHeight);
    setScreen(startScreen);
}