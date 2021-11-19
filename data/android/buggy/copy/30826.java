@java.lang.Override
public Move getMove(Square[][] board, int turnNum) {
    return alphaBetaPruning(board, java.lang.Math.min(initialDepth, (36 - turnNum)), java.lang.Integer.MIN_VALUE, java.lang.Integer.MAX_VALUE);
}