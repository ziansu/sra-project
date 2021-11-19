@java.lang.Override
protected void onStop() {
    super.onStop();
    net.ldvsoft.warofviruses.GameActivity.lastSavedGameID = net.ldvsoft.warofviruses.GameActivity.DO_NOT_SAVE_GAME;
}