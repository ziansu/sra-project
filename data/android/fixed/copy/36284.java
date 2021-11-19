@java.lang.Override
public void tryPlayMove(org.empyrn.darkknight.gamelogic.Move m) {
    if (!(isPlayerTurn())) {
        throw new java.lang.IllegalStateException("Cannot play move during player turn");
    }
    if (doMove(m)) {
        sendMove(m);
        onMoveMade();
    }
}