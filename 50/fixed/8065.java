public void initializeGame(int columns, int rows, int playerID) {
    this.columns = columns;
    this.rows = rows;
    this.playerID = playerID;
    state = new State(columns, rows, playerID);
}