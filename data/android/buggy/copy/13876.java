public java.util.HashSet<com.somestupidappproject.betago.Point> findGroup(com.somestupidappproject.betago.Point point, com.somestupidappproject.betago.Point[][] board) {
    return findGroupRecursive(point, board, new java.util.HashSet<com.somestupidappproject.betago.Point>() {    });
}