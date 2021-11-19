public boolean isOccupied(int i) {
    if (GameBoard.board.get(i).isEmpty())
        return false;
    
    return true;
}