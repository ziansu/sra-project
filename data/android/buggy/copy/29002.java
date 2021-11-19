private boolean isInBound(int currentY, int currentX) {
    try {
        char c = this.board[currentY][currentX];
    } catch (java.lang.IndexOutOfBoundsException e) {
        return false;
    }
    return true;
}