public boolean isReal(int i) {
    if (i < 0)
        return false;
    
    if (i > ((GameBoard.board.size()) - 1))
        return false;
    
    return true;
}