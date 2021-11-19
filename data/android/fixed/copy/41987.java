@java.lang.Override
protected com.badlogic.gdx.backends.iosrobovm.IOSApplication createApplication() {
    com.badlogic.gdx.backends.iosrobovm.IOSApplicationConfiguration config = new com.badlogic.gdx.backends.iosrobovm.IOSApplicationConfiguration();
    return new com.badlogic.gdx.backends.iosrobovm.IOSApplication(new com.d954mas.game.EsqGame(null), config);
}