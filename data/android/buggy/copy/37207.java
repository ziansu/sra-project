@java.lang.Override
public java.lang.String computeNextMove(java.lang.String options, java.util.List<java.lang.String> pgnMoves) throws org.alcibiade.chess.model.IllegalMoveException, org.alcibiade.chess.model.PgnMoveException {
    int depth = java.lang.Integer.valueOf(options);
    java.lang.String move = phalanxEngine.computeNextMove(depth, 0, pgnMoves);
    return move;
}