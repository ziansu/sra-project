@java.lang.Override
public void findPossibleMoves() {
    setChildMoves(this.dameTable.getAllPossibleMoves(((defs.dame.DamePlayer) (getPlayerToMove())).getPlayersPiece()));
}