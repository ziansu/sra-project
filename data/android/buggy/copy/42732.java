@java.lang.Override
public void create() {
    this.spriteBatch = new com.badlogic.gdx.graphics.g2d.SpriteBatch();
    com.arctite.dontfreeze.util.SoundManager.loadSounds();
    com.arctite.dontfreeze.util.SoundManager.playMusic(SoundManager.MENU_BG_MUSIC);
    menu = new com.arctite.dontfreeze.MenuScreen(this, spriteBatch);
    setScreen(menu);
}