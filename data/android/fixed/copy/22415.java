@java.lang.Override
public void run() {
    if ((torrentFile) == null) {
        Log("Invalid peer state. Aborting...");
        shutDown();
    }
    if ((downPiece) == null) {
        downPiece = this.torrentFile.GetNextPieceForPeer(this);
    }
}