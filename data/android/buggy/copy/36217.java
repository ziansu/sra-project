public void mousePressed() {
    java.lang.System.out.println("yes");
    if ((player[currentPlayer]) instanceof HumanPlayer) {
        Move m = gameUI.getHighlightedMove();
        PerformMove(m);
    }
}