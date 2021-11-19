public void stop() {
    if (mRunning) {
        android.util.Log.i(ch.logixisland.anuto.game.GameEngine.TAG, "Stopping game loop");
        mRunning = false;
    }
}