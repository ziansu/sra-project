public void loadGame(entity.Texts text, java.lang.String gameName) throws java.sql.SQLException {
    sql.useDB(gameName);
    loadPlayers();
    gameboard.setupBoard(text, gameName, players, sql);
}