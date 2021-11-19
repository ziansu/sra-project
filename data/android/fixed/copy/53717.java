@java.lang.Override
public void create() {
    batch = new com.badlogic.gdx.graphics.g2d.SpriteBatch();
    img = new com.badlogic.gdx.graphics.Texture("badlogic.jpg");
    com.mygdx.game.GridWars.atlas = new com.badlogic.gdx.graphics.g2d.TextureAtlas(Gdx.files.internal("GDSprites.pack"));
    setScreen(new com.mygdx.game.screens_ui.BattleScreen(this));
}