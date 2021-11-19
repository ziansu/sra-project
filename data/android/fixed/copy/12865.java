private int getTurn(java.util.ArrayList<application.Move> currentMoves, int nextMoveTurn) {
    if (nextMoveTurn != (-1)) {
        return nextMoveTurn;
    }else {
        return lastMove(currentMoves).getCurrentPlayer();
    }
}