private void setPremierTirage() {
    int plop = tirage[org.oucho.tetris.Game.rgenerator.nextInt(tirage.length)];
    do {
        currentPiece = new org.oucho.tetris.Pieces(true, plop);
    } while ((currentPiece.type) == (nextPiece.type) );
}