public void anotherTurn(int turn) {
    java.lang.String anotherUser = getUserPlayer().get(turn);
    gomoku.anotherTurn(anotherUser);
}