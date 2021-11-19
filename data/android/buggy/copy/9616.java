@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    gameView = new abyssproductions.double0driver.GameEngine.GameSurfaceView(this);
    this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
    setContentView(gameView);
    super.onDestroy();
}