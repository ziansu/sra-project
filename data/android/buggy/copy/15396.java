public boolean isGameOver() {
    int score = board.evaluateBoard();
    printAccess();
    printField();
    if (score == 1) {
        didSomeoneWin = true;
        return true;
    }else
        return false;
    
}