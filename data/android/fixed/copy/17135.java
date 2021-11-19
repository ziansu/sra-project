public static void main(java.lang.String[] args) {
    Game.GameArea.game = new Game.PhysicalBoard();
    Game.GameArea.player1 = new Game.AIPlayer(Game.GameArea.game, (-1));
    Game.GameArea.game.setVisible(true);
}