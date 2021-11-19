public com.checkerbot.checkerbot.Square get(android.graphics.Point p) {
    try {
        return board[p.y][p.x];
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        return null;
    }
}