private int getTurn(java.util.ArrayList<application.Move> currentMoves, int nextMoveTurn) {
    if (nextMoveTurn != (-1)) {
        int temp = nextMoveTurn;
        return temp;
    }else {
        return lastMove(currentMoves).getCurrentPlayer();
    }
}