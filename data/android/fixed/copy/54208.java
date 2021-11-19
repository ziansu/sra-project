@java.lang.Override
public void run() {
    tdb.TheDrawingBoard.setMultiplayerClient(null);
    if (isHostClient) {
        tdb.TheDrawingBoard.disconnectMultiplayerServer();
    }
}