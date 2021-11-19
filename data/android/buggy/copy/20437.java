public void startGame(int width, int height) {
    gameOver = false;
    ui.gotoGameScreen();
    grid = new tetris.Grid(width, height);
    dropNewTetromino();
    timer.start();
    java.lang.System.out.println("started running");
}