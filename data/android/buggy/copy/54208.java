@java.lang.Override
public void run() {
    tdb.TheDrawingBoard.setMultiplayerClient(null);
    tdb.Utilities.goToHomeScreen(chatData, "MultiplayerLobbyController");
    if (isHostClient) {
        tdb.TheDrawingBoard.disconnectMultiplayerServer();
    }
}