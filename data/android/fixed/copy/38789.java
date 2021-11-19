public java.util.ArrayList getDBCursorArray(java.lang.String request, com.example.seth.scorekeeper.ScoreDBAdapter dbHelper) {
    return convertToArray(dbHelper.getNewestGame());
}