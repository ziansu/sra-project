@java.lang.Override
public void draw(com.badlogic.gdx.graphics.g2d.SpriteBatch batch) {
    no.tobkje.aagame.hud.TimeValue.font.draw(batch, toString(), getPosition().x, getPosition().y);
}