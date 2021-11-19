public void makeMove(int col, int row, tp.pr5.logic.Counter colour) {
    tp.pr5.logic.Move move = this.factory.createMove(col, row, colour);
    try {
        this.game.executeMove(move);
    } catch (tp.pr5.logic.InvalidMove e) {
    }
}