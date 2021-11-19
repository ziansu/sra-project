public boolean isAlive(com.somestupidappproject.betago.Point point, com.somestupidappproject.betago.Point[][] board) {
    return isAliveRecursive(point, board, new java.util.HashSet<com.somestupidappproject.betago.Point>() {    });
}