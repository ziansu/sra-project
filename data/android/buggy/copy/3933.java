static week4.Solver.SearchNode byHamming(week4.Board board, int moves) {
    return new week4.Solver.SearchNode(board, (moves + (board.hamming())));
}