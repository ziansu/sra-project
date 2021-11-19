@java.lang.Override
public void onJoinedRoom(int statusCode, com.google.android.gms.games.multiplayer.realtime.Room room) {
    if (statusCode != (com.google.android.gms.games.GamesStatusCodes.STATUS_OK)) {
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        showGameError();
    }
    showWaitingRoom(room);
}