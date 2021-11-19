@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.badlogic.gdx.backends.android.AndroidApplicationConfiguration config = new com.badlogic.gdx.backends.android.AndroidApplicationConfiguration();
    config.useAccelerometer = false;
    config.useCompass = false;
    initialize(new com.remnants.game.Remnants(), config);
}