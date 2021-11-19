public void setToNormalColor() {
    color = (((((file) - 97) + (rank)) % 2) == 0) ? com.chessEngine.game.Square.LIGHT : com.chessEngine.game.Square.DARK;
}