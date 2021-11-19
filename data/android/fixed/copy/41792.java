public void addLoadedTetriminos(tetris.tetriminos.Tetriminos... tetriminos) {
    tetris.tetriminos.TetriminosFactory.TETRIMINOS_QUEUE.clear();
    java.util.Collections.addAll(tetris.tetriminos.TetriminosFactory.TETRIMINOS_QUEUE, tetriminos);
    tetris.PlayThread.setFalling(getTetriminosFromTop());
    tetris.PlayThread.fillNextTetriminos();
}