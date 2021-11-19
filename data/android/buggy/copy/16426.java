@java.lang.Override
public void dispose() {
    Gdx.app.debug("proto screen", "disposed");
    TradesongGame.turnTimer.stop();
    TradesongGame.turnTimer.clear();
}