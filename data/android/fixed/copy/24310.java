public void randomMove() {
    tp.pr5.logic.Move move = random.getMove(this.game.getBoard(), this.game.getTurn());
    this.game.executeMove(move);
}