public java.util.ArrayList getDBCursorArray(java.lang.String request, com.example.seth.scorekeeper.ScoreDBAdapter dbHelper) {
    int index = dbHelper.getNewestGame(request).getColumnIndex(request);
    java.lang.String value = dbHelper.getNewestGame(request).getString(index);
    return convertToArray(value);
}