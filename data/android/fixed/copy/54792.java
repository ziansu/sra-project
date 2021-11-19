private void drawGame(java.awt.Graphics g) {
    if (!(setup)) {
        setup = setupBoard();
    }
    drawGoal(g);
    drawPlayer(g);
}