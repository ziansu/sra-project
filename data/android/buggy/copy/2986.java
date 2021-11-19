public void makeMove(int input) {
    switchPlayer();
    insertIntoBoard(input);
    checkDraw();
    checkWinner();
}