static week4.Solver.SearchNode byHamming(week4.Board board, int moves) {
    return new week4.Solver.SearchNode(board, (0 + (board.hamming())));
}