public boolean modifyBoard(int loc, int type) {
    if ((board[loc]) == 0) {
        board[loc] = type;
        return true;
    }
    return false;
}