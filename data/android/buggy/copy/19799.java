private boolean isBoardFull() {
    for (com.player.Symbol[] symbols : board) {
        for (com.player.Symbol symbol : symbols) {
            if (symbol == (com.player.Symbol.EMPTY))
                return false;
            
        }
    }
    return true;
}