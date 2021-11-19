private void tileClicked(java.lang.String tileIndex) {
    java.lang.System.out.println("tileClicked()");
    checkIfTileShouldMoveAndMove(tileIndex);
    if ((checkIfAllTilesAreInPlace()) || ((score) <= 0))
        endGame(score);
    
}