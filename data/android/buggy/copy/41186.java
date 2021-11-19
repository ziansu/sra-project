public static engine.board.Board getInstance() {
    if ((engine.board.Board.instance) == null) {
        engine.board.Board.instance = new engine.board.Board();
        return engine.board.Board.instance;
    }else
        return engine.board.Board.instance;
    
}