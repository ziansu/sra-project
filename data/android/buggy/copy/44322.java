public boolean checkValid(aiproj.hexifence.Move m) {
    if ((gameBoard[m.Col][m.Row]) == '+') {
        return true;
    }
    return false;
}